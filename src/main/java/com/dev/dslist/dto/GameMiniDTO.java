package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class GameMiniDTO {
    private Long Id;
    private String title;
    private Double score;
    @Column(name = "game_year")
    private Integer year;

    private String imgURL;
    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    public GameMiniDTO(Game game) {
        Id = game.getId();
        title = game.getTitle();
        shortDescription = game.getShortDescription();
        imgURL = game.getImgURL();
        year = game.getYear();
        score = game.getScore();
    }

}
