package main.java;

import java.util.HashMap;
import java.util.Map;

public enum RobotInstruction {
    LEFT("L"),
    RIGHT("R"),
    FORWARD("F");

    private String instruction;

    private static final Map<String, RobotInstruction> lookup = new HashMap<>();

    static {
        for (RobotInstruction ri : RobotInstruction.values()) {
            lookup.put(ri.getInstruction(), ri);
        }
    }

    private RobotInstruction(String instruction) {
        this.instruction = instruction;
    }

    private String getInstruction() {
        return instruction;
    }

    static RobotInstruction get(String instruction) {
        return lookup.get(instruction);
    }
}
