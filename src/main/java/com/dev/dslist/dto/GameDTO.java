package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Optional;

@Data
@NoArgsConstructor
public class GameDTO {
    private Long Id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgURL;
    private String shortDescription;
    private String longDescription;


    public GameDTO(Game game){
        BeanUtils.copyProperties(game, this);
    }

}
