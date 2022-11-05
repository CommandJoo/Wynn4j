package de.jo.wynn.api.requests.player.impl.gameclass.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

import java.util.List;

public class Raids {

    @Expose
    public int completed;

    @Expose
    public List<Raid> list;

    public static class Raid {
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
