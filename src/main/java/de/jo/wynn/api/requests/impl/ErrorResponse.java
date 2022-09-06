package de.jo.wynn.api.requests.impl;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.requests.Response;

public class ErrorResponse extends Response {

    @Expose
    public String error;

}
