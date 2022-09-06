package de.jo.wynn.util;

import de.jo.wynn.api.WynnCraftAPI;

import java.io.InputStream;
import java.io.Reader;
import java.net.URL;

public class URLHelper {

    public static InputStream read(WynnCraftAPI api, String url) {
        try {
            return new URL(url).openStream();
        } catch(Exception ex) {
            api.getDebugger().debug("Could not open connection to: "+url, Debugger.DebugType.ERROR);
            return null;
        }
    }

    public static String readAll(WynnCraftAPI api, Reader reader) {
        try {
            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = reader.read()) != -1) {
                sb.append((char) cp);
            }
            return sb.toString();
        } catch(Exception ex) {
            api.getDebugger().debug("Error while trying to read input from reader at: URLHelper.java, readAll(Reader reader)", Debugger.DebugType.ERROR);
            return null;
        }
    }

}
