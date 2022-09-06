package de.jo.wynn.api.requests.player.impl.gameclass.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class GameMode {

    @Expose
    public boolean craftsman;
    @Expose
    public boolean hardcore;
    @Expose
    public boolean ironman;

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
