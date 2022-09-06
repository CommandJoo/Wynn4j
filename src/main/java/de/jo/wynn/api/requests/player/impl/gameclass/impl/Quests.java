package de.jo.wynn.api.requests.player.impl.gameclass.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

import java.util.List;

public class Quests {

    @Expose
    public int completed;

    @Expose
    public List<String> list;

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
