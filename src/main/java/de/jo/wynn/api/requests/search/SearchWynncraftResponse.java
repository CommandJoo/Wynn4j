package de.jo.wynn.api.requests.search;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.requests.Response;

import java.util.List;

public class SearchWynncraftResponse extends Response {

    @Expose
    public List<String> guilds;
    @Expose
    public List<String> players;

    @Expose
    public WynnRequestData request;

}
