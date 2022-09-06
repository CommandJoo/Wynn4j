package de.jo.wynn.api.requests.impl.rest;

import de.jo.wynn.api.requests.Request;

public abstract class RestRequest extends Request {

    public RestRequest(Class<? extends RestResponse> response, String url) {
        super(response, "v2/"+url);
    }
}
