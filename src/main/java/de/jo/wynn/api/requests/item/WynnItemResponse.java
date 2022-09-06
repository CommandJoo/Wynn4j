package de.jo.wynn.api.requests.item;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnItemData;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.requests.Response;

import java.util.List;

public class WynnItemResponse extends Response {
    @Expose
    public List<WynnItemData> items;
    @Expose
    public WynnRequestData request;

}
