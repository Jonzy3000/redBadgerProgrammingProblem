package main.java;

public class RobotFinalOutput {
    private final Point endPoint;
    private final CompassDirection endDirection;
    private final boolean isLost;

    public RobotFinalOutput(Point endPoint, CompassDirection endDirection, boolean isLost) {
        this.endPoint = endPoint;
        this.endDirection = endDirection;
        this.isLost = isLost;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public CompassDirection getEndDirection() {
        return endDirection;
    }

    public boolean isLost() {
        return isLost;
    }
}