package de.jo.wynn.api.impl.recipe;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class RecipeGetRequest extends RestRequest {
    public RecipeGetRequest(String name) {
        super(RecipeGetResponse.class, "recipe/get/"+name);
    }
}
