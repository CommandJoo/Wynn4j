package de.jo.wynn.api.impl.guild;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.request.Response;

import java.util.List;

public class GuildListResponse extends Response {

    @Expose
    public List<String> guilds;
    @Expose
    public WynnRequestData request;

}
