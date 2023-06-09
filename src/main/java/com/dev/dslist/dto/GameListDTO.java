package com.dev.dslist.dto;

import com.dev.dslist.entities.Game;
import com.dev.dslist.entities.GameList;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }
}
