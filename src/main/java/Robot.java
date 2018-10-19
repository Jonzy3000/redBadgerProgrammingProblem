package main.java;

import java.util.List;

public class Robot {
    private final Point startingPoint;
    private final CompassDirection startingDirection;
    private final List<RobotInstruction> instructions;
    private CompassDirection currentDirection;
    private Point currentPoint;

    public Robot(Point startingPoint, CompassDirection startingDirection, List<RobotInstruction> instructions) {
        this.startingPoint = startingPoint;
        this.startingDirection = startingDirection;
        this.currentDirection = startingDirection;
        this.instructions = instructions;
        this.currentPoint = startingPoint;
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

    public Point getCurrentPoint() {
        return currentPoint;
    }

    public RobotFinalOutput processInstructions(World world) {
        boolean isLost = false;
        for (RobotInstruction instruction : this.instructions) {
            currentDirection = currentDirection.getDirection(instruction);
            if (!instruction.equals(RobotInstruction.FORWARD)) {
                continue;
            }

            Point nextPoint = currentPoint.move(currentDirection.move());
            if (world.isOutOfThisWorld(nextPoint)) {
                isLost = true;
                break;
            } else {
                currentPoint = nextPoint;
            }
        }

        return new RobotFinalOutput(
                currentPoint,
                currentDirection,
                isLost
        );
    }
}
