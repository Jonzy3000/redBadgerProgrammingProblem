package main.java;

import java.util.HashSet;
import java.util.Set;

public class World {
    private final Point upperRightPoint;
    private final Set<Point> lostPoints = new HashSet<>();

    public World(int x, int y) {
        this.upperRightPoint = new Point(x, y);
    }

    public World(Point upperRightPoint) {
        this.upperRightPoint = upperRightPoint;
    }

    public Point getUpperRightPoint() {
        return upperRightPoint;
    }

    public boolean isOutOfThisWorld(Point point) {
        return point.getX() > upperRightPoint.getX() || point.getY() > upperRightPoint.getY() || point.getX() < 0 || point.getY() < 0;
    }

    public void addLostRobot(Robot robot) {
        this.lostPoints.add(robot.getCurrentPoint());
    }

    public boolean hasRobotAlreadyBeenLostHere(Robot robot) {
        return lostPoints.contains(robot.getCurrentPoint());
    }
}
