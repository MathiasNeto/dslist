package com.dev.dslist.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;
@Embeddable
@Data
@NoArgsConstructor
public class BelongingPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList gameList;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    public BelongingPK(GameList gameList, Game game) {
        this.gameList = gameList;
        this.game = game;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return Objects.equals(gameList, that.gameList) && Objects.equals(game, that.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameList, game);
    }
}
