package de.jo.wynn.util;

import de.jo.wynn.api.WynnCraftAPI;

public class Debugger {

    private final WynnCraftAPI api;

    public Debugger(WynnCraftAPI api) {
        this.api = api;
    }

    public void debug(String text, DebugType type) {
        if(api.allowDebugging()) {
            System.out.println(type.getColor()+text+ConsoleColors.RESET);
        }
    }

    public enum DebugType {

        INFO(ConsoleColors.BLUE), WARNING(ConsoleColors.YELLOW_BRIGHT), ERROR(ConsoleColors.RED_BOLD);

        private final String color;

        DebugType(String color) {
            this.color = color;
        }

        public String getColor() {
            return color;
        }
    }

}
