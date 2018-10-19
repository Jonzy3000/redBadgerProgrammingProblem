package main.java;

import java.util.HashMap;
import java.util.Map;

public enum CompassDirection {
    NORTH("N"),
    EAST("E"),
    SOUTH("S"),
    WEST("W");

    private final String direction;

    private static final Map<String, CompassDirection> lookup = new HashMap<String, CompassDirection>();

    static {
        for (CompassDirection cd : CompassDirection.values()) {
            lookup.put(cd.getDirection(), cd);
        }
    }

    private CompassDirection(String direction) {
        this.direction = direction;
    }

    public static CompassDirection get(String direction) {
        return lookup.get(direction);
    }

    public String getDirection() {
        return direction;
    }
}
