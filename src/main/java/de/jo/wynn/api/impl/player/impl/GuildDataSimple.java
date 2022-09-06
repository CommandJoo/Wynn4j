package de.jo.wynn.api.impl.player.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class GuildDataSimple {

    @Expose
    public String name;
    @Expose
    public String rank;

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
