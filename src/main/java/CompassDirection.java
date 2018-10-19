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

    private int getValidOrdinal(int ordinal) {
        CompassDirection[] values = CompassDirection.values();

        if (ordinal < 0) {
            ordinal = values.length - 1;
        } else if (ordinal >= values.length) {
            ordinal = 0;
        }

        return ordinal;
    }

    public CompassDirection getDirection(RobotInstruction instruction) {
        CompassDirection[] values = CompassDirection.values();
        int currentOrdinal = this.ordinal();

        switch (instruction) {
            case LEFT:
                currentOrdinal -= 1;
                break;
            case RIGHT:
                currentOrdinal += 1;
                break;
            case FORWARD:
            default:
                return this;
        }

        return values[getValidOrdinal(currentOrdinal)];
    }

    public Point move() {
        switch (this) {
            case EAST:
                return new Point(1, 0);
            case WEST:
                return new Point(-1, 0);
            case NORTH:
                return new Point(0, 1);
            case SOUTH:
                return new Point(0, -1);
            default:
                return new Point(0, 0);
        }
    }
}
