package de.jo.wynn.api.request.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.request.Response;

public class ErrorResponse extends Response {

    @Expose
    public String error;

}
