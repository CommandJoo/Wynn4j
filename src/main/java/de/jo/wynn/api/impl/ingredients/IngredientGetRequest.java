package de.jo.wynn.api.impl.ingredients;

import de.jo.wynn.api.request.impl.rest.RestRequest;

public class IngredientGetRequest extends RestRequest {

    public IngredientGetRequest(String name) {
        super(IngredientGetResponse.class, "ingredient/get/"+name);
    }
}
