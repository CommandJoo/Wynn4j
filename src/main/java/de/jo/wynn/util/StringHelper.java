package de.jo.wynn.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.lang.reflect.Field;

public class StringHelper {

    public static String prettyJson(String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonElement je = new JsonParser().parse(json);
        return gson.toJson(je);
    }

    public static String toStringMethod(Object input) {
        Class<?> c = input.getClass();
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        Field[] fields = input.getClass().getDeclaredFields();

        int it = 0;
        for(Field f : fields) {
            try {
                if(!f.isAccessible()) {
                    f.setAccessible(true);

                    String val = f.getType() == String.class ? ("\"" + f.get(input) + "\"") : ""+f.get(input);

                    builder.append(it > 0 ? ", " : "").append("\"").append(f.getName()).append("\"").append(": ").append(val);
                    f.setAccessible(false);
                }else{
                    String val = f.getType() == String.class ? ("\"" + f.get(input) + "\"") : ""+f.get(input);
                    builder.append(it > 0 ? ", " : "").append("\"").append(f.getName()).append("\"").append(": ").append(val);
                }
                it++;
            } catch(Exception ignored) {}
        }

        return builder.append("}").toString();
    }

}
