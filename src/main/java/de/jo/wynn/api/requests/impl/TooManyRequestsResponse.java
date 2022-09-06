package de.jo.wynn.api.requests.impl;

import de.jo.wynn.api.requests.Response;

public class TooManyRequestsResponse extends Response {

    public String info = "Too many requests have been sent \n please remember that you can only send 600 requests every 30 minutes";

}
