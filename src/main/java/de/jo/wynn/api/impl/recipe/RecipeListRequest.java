package de.jo.wynn.api.impl.recipe;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class RecipeListRequest extends RestRequest {

    public RecipeListRequest() {
        super(RecipeListResponse.class, "recipe/list");
    }
}
