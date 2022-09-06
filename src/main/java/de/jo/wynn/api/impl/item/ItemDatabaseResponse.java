package de.jo.wynn.api.impl.item;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnItemData;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.request.Response;

import java.util.List;

public class ItemDatabaseResponse extends Response {
    @Expose
    public List<WynnItemData> items;
    @Expose
    public WynnRequestData request;

}
