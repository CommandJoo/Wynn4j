package de.jo.wynn.api.requests;

import de.jo.wynn.util.StringHelper;

public abstract class Response {
    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }
}
