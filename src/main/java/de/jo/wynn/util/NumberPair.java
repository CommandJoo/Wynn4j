package de.jo.wynn.util;

import com.google.gson.annotations.Expose;

public class NumberPair {

    @Expose
    public float minimum;
    @Expose
    public float maximum;

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }
}
