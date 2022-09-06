package de.jo.wynn.api.request.impl.rest;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.request.Response;

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
