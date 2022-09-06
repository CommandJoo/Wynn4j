package de.jo.wynn;

import de.jo.wynn.api.WynnCraftAPI;
import de.jo.wynn.api.data.WynnRecipeData;
import de.jo.wynn.api.requests.recipe.RecipeGetRequest;
import de.jo.wynn.api.requests.recipe.RecipeGetResponse;

public class TrueMain {

    public static void main(String[] args) {
        WynnCraftAPI api = new WynnCraftAPI(true);
        RecipeGetResponse recipeResponse = (RecipeGetResponse) api.request(new RecipeGetRequest("Boots-3-5"));
        for(WynnRecipeData recipeData : recipeResponse.data) {
            System.out.println(recipeData.materials);
        }
    }

}
