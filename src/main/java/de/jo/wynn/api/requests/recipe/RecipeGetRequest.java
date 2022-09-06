package de.jo.wynn.api.requests.recipe;

import de.jo.wynn.api.requests.impl.rest.RestRequest;

public class RecipeGetRequest extends RestRequest {
    public RecipeGetRequest(String name) {
        super(RecipeGetResponse.class, "recipe/get/"+name);
    }
}
