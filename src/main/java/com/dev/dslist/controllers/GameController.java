package com.dev.dslist.controllers;

import com.dev.dslist.dto.GameDTO;
import com.dev.dslist.dto.GameMiniDTO;
import com.dev.dslist.entities.Game;
import com.dev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping()
    public List<GameMiniDTO> findAll(){
        List<GameMiniDTO> result = gameService.findAll();
        return result;
    }
    @GetMapping(value = "/{id}")
    public GameDTO findAll(@PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }
}