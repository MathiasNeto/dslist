package com.dev.dslist.services;

import com.dev.dslist.dto.GameMiniDTO;
import com.dev.dslist.entities.Game;
import com.dev.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public List<GameMiniDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        List<GameMiniDTO> dto = result.stream().map(x-> new GameMiniDTO(x)).toList();
        return dto;
    }
}
