package de.jo.wynn.api.request;

import de.jo.wynn.util.StringHelper;

public abstract class Response {
    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }
}
