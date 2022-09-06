package de.jo.wynn.api.data;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.NumberPair;
import de.jo.wynn.util.StringHelper;

import java.util.HashMap;
import java.util.List;

public class WynnIngredientData {

    @Expose
    public String name;
    @Expose
    public int tier;
    @Expose
    public int level;
    @Expose
    public List<String> skills;

    public static class Sprite {
        @Expose
        public int id;
        @Expose
        public int damage;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }
    @Expose
    public Sprite sprite;
    @Expose
    public HashMap<String, NumberPair> identifications;

    @Expose
    public HashMap<String, Integer> itemOnlyIDs;
    @Expose
    public HashMap<String, Integer> consumableOnlyIDs;
    @Expose
    public HashMap<String, Integer> ingredientPositionModifiers;

}
