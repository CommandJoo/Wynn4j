package de.jo.wynn.api.data;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.NumberPair;
import de.jo.wynn.util.StringHelper;

import java.util.List;

public class WynnRecipeData {

    @Expose
    public NumberPair level;
    @Expose
    public String type;
    @Expose
    public String skill;
    @Expose
    public List<Material> materials;
    @Expose
    public NumberPair healthOrDamage;
    @Expose
    public NumberPair durability;
    @Expose
    public String id;

    public static class Material {
        @Expose
        public String item;
        @Expose
        public int amount;

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
