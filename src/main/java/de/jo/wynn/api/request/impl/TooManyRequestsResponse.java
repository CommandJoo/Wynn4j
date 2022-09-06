package de.jo.wynn.api.request.impl;

import de.jo.wynn.api.request.Response;

public class TooManyRequestsResponse extends Response {

    public String info = "Too many requests have been sent \n please remember that you can only send 600 requests every 30 minutes";

}
