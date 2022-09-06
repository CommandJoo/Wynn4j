package de.jo.wynn.api.requests.player.impl.gameclass.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

import java.util.List;

public class Dungeons {

    @Expose
    public int completed;

    @Expose
    public List<Dungeon> list;

    public static class Dungeon {
        @Expose
        public String name;
        @Expose
        public int completed;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
