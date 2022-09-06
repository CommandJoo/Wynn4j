package de.jo.wynn.api.objects.network;

public class WynnWorldInfo {

    private String worldName;
    private int online;

    public WynnWorldInfo(String worldName, String online) {
    }

    public int getOnline() {
        return online;
    }

    public String getWorldName() {
        return worldName;
    }
}
