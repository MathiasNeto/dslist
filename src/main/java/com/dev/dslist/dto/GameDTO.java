package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;



@Data
@NoArgsConstructor
public class GameDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String img_Url;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
    }

}
