package de.jo.wynn.api.requests.ingredients;

import de.jo.wynn.api.requests.impl.rest.RestRequest;

public class IngredientGetRequest extends RestRequest {

    public IngredientGetRequest(String name) {
        super(IngredientGetResponse.class, "ingredient/get/"+name);
    }
}
