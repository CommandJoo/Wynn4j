package de.jo.wynn.api.requests.recipe;

import de.jo.wynn.api.requests.impl.rest.RestRequest;

public class RecipeListRequest extends RestRequest {

    public RecipeListRequest() {
        super(RecipeListResponse.class, "recipe/list");
    }
}
