package de.jo.wynn.api.requests.player.impl.gameclass.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class Skills {

    @Expose
    public float strength;
    @Expose
    public float dexterity;
    @Expose
    public float intelligence;
    @Expose
    public float defence;
    @Expose
    public float defense;
    @Expose
    public float agility;

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }

}
