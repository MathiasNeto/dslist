package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;
import jakarta.persistence.Column;

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
        imgURL = game.getImgURI();
        year = game.getYear();
        score = game.getScore();
    }

    public GameMiniDTO() {
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgURL() {
        return imgURL;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
