package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;
import com.dev.dslist.projections.GameMinProjection;

import lombok.Data;

@Data
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        this.imgUrl = entity.getImg_Url();
        shortDescription = entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getId();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImg_Url();
        shortDescription = projection.getShortDescription();
    }

}
