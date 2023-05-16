package com.dev.dslist.projections;

import lombok.Data;


public interface GameMinProjection {
    Long getId();
    String getTitle();
    Integer getGameYear();
    String getImg_Url();
    String getShortDescription();
    Integer getPosition();
}
