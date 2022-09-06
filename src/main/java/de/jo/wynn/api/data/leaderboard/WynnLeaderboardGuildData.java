package de.jo.wynn.api.data.leaderboard;

import com.google.gson.annotations.Expose;
import de.jo.wynn.util.StringHelper;

import java.util.List;

public class WynnLeaderboardGuildData {

    @Expose
    public int membersCount;
    @Expose
    public int num;

    @Expose
    public String name;
    @Expose
    public String prefix;
    @Expose
    public float xp;
    @Expose
    public int level;
    @Expose
    public String created;
    @Expose
    public int territories;
    @Expose
    public GuildBanner banner;

    public static class GuildBanner {
        /*
         * WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK
         */
        @Expose
        public String base;
        @Expose
        public int tier;
        @Expose
        public List<GuildBannerLayer> layers;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }

    public static class GuildBannerLayer {
        /*
         * WHITE, ORANGE, MAGENTA, LIGHT_BLUE, YELLOW, LIME, PINK, GRAY, LIGHT_GRAY, CYAN, PURPLE, BLUE, BROWN, GREEN, RED, BLACK
         */
        @Expose
        public String colour;
        /*
         * CIRCLE_MIDDLE, SQUARE_BOTTOM_LEFT, SQUARE_BOTTOM_RIGHT, SQUARE_TOP_LEFT, SQUARE_TOP_RIGHT, HALF_HORIZONTAL, STRIPE_BOTTOM,
         * STRIPE_TOP, HALF_VERTICAL, STRIPE_LEFT, STRIPE_CENTER, STRIPE_RIGHT, STRIPE_MIDDLE, STRAIGHT_CROSS, STRIPE_DOWNLEFT,
         * STRIPE_DOWNRIGHT, CROSS, DIAGONAL_LEFT, DIAGONAL_UP_RIGHT, TRIANGLE_TOP, TRIANGLE_BOTTOM, RHOMBUS_MIDDLE, TRIANGLES_TOP,
         * TRIANGLES_BOTTOM, CURLY_BORDER, BORDER, STRIPE_SMALL, BRICKS, GRADIENT, CREEPER, SKULL, FLOWER, MOJANG,
         * DIAGONAL_LEFT_MIRROR, DIAGONAL_RIGHT, GRADIENT_UP, HALF_HORIZONTAL_MIRROR, or HALF_VERTICAL_MIRROR
         */
        @Expose
        public String pattern;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }

    @Override
    public String toString() {
        return StringHelper.toStringMethod(this);
    }
}
