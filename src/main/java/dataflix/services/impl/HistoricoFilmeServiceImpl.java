package dataflix.services.impl;

import dataflix.entities.HistoricoFilme;
import dataflix.exceptions.ServiceException;
import dataflix.models.dto.RetornoHistoricoDTO;
import dataflix.repositories.HistoricoFilmeRepository;
import dataflix.services.FilmeService;
import dataflix.services.HistoricoFilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistoricoFilmeServiceImpl implements HistoricoFilmeService {

    @Autowired
    private HistoricoFilmeRepository historicoFilmeRepository;

    @Autowired
    private FilmeService filmeService;

    @Override
    public ResponseEntity<List<RetornoHistoricoDTO>> getHistoricoByUserId(String userId) {
        try  {
            var entityList = historicoFilmeRepository.getHistoricoByUserId(Long.parseLong(userId));
            var dtoList = entityList.stream()
                    .map(entity -> {
                        var filme = filmeService.getFilmeById(entity.getIdFilme().toString());
                        return RetornoHistoricoDTO.builder()
                                .idImagem(filme.getIdImagem())
                                .nomeFilme(filme.getNomeFilme())
                                .tempoAssistido(entity.getTempoAssistido())
                                .idFilme(entity.getId().toString())
                                .build();
                    })
                    .collect(Collectors.toList());
            return new ResponseEntity<>(dtoList, HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>(new ArrayList<>(), e.getHttpStatus());
        }

    }

    @Override
    public ResponseEntity<String> insereHistorico(String usuarioId, String filmeId, String histId) {
        try  {
            var entity = new HistoricoFilme();
            entity.setIdFilme(Long.parseLong(filmeId));
            entity.setIdUsuario(Long.parseLong(usuarioId));
            if (histId!="0") {
                entity.setId(Long.parseLong(histId));
            }
            historicoFilmeRepository.save(entity);
            return new ResponseEntity<>("Histórico cadastrado com sucesso", HttpStatus.OK);
        } catch (ServiceException e) {
            return new ResponseEntity<>("Erro ao cadastrar histórico", e.getHttpStatus());
        }
    }
}
