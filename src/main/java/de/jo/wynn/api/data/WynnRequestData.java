package de.jo.wynn.api.data;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

public class WynnRequestData {

    @Expose
    public long timestamp;
    @Expose
    public float version;


    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }
}
