package de.jo.wynn.api.requests.impl.rest;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.requests.Response;

public class RestResponse extends Response {

    @Expose
    public String kind;
    @Expose
    public int code;
    @Expose
    public long timestamp;
    @Expose
    public String version;

}
