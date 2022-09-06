package de.jo.wynn.api.requests;

import com.google.gson.Gson;

public abstract class Request {

    public String url;
    public static String PHP_QUERY = "public_api.php?action=";
    public Class<? extends Response> responseClass;

    public Request(Class<? extends Response> responseClass, String url) {
        this.responseClass = responseClass;
        this.url = url;
    }
    public Response response(Gson gson, String json) {
        return gson.fromJson(json, this.responseClass);
    }
}
