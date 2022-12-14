package de.jo.wynn.api.requests.guild;

import com.google.gson.annotations.Expose;
import de.jo.wynn.api.data.WynnRequestData;
import de.jo.wynn.api.requests.Response;
import de.jo.wynn.util.StringHelper;

import java.util.List;

public class GuildStatsResponse extends Response{

    @Expose
    public List<GuildMember> members;
    @Expose
    public String createdFriendly;

    public static class GuildMember {
        @Expose
        public String name;
        @Expose
        public String uuid;
        @Expose
        public String rank;
        @Expose
        public float contributed;
        @Expose
        public String joined;
        @Expose
        public String joinedFriendly;

        @Override
        public String toString() {
            return StringHelper.toStringMethod(this);
        }
    }

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

    @Expose
    public WynnRequestData request;

}
