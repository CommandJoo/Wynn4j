package de.jo.wynn.api.impl.search;

import de.jo.wynn.api.request.Request;
import de.jo.wynn.api.request.Response;

public class SearchWynncraftRequest extends Request {
    public SearchWynncraftRequest(String query) {
        super(SearchWynncraftResponse.class, PHP_QUERY+"statsSearch&search="+query);
    }
}
