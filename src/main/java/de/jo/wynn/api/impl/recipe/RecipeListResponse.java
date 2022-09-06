package de.jo.wynn.api.impl.recipe;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.request.impl.rest.RestResponse;

import java.util.List;

public class RecipeListResponse extends RestResponse {

    @Expose
    public List<String> data;

}
