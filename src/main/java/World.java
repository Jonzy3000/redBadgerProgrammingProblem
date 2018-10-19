package main.java;

public class World {
    private final Point upperRightPoint;

    public World(int x, int y) {
        this.upperRightPoint = new Point(x, y);
    }

    public World(Point upperRightPoint) {
        this.upperRightPoint = upperRightPoint;
    }

    private void createMap(int x, int y) {

    }

    public Point getUpperRightPoint() {
        return upperRightPoint;
    }
}
