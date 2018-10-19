package main.java;

import java.util.List;

public class Robot {
    Point startingPoint;
    CompassDirection startingDirection;
    List<RobotInstruction> instructions;

    public Robot(Point startingPoint, CompassDirection startingDirection, List<RobotInstruction> instructions) {
        this.startingPoint = startingPoint;
        this.startingDirection = startingDirection;
        this.instructions = instructions;
    }

    public Point getStartingPoint() {
        return startingPoint;
    }

    public CompassDirection getStartingDirection() {
        return startingDirection;
    }

    public List<RobotInstruction> getInstructions() {
        return instructions;
    }
}
