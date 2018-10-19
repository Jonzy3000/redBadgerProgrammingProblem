package test.java;

import main.java.Point;
import main.java.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorldTest {

    @Test
    public void isOutOfThisWorldRightTest() {
        World world = new World(10, 10);
        boolean outOfThisWorld = world.isOutOfThisWorld(new Point(11, 10));
        Assertions.assertTrue(outOfThisWorld);
    }

    @Test
    public void isOutOfThisWorldLeftTest() {
        World world = new World(10, 10);
        boolean outOfThisWorld = world.isOutOfThisWorld(new Point(-1, 10));
        Assertions.assertTrue(outOfThisWorld);
    }

    @Test
    public void isOutOfThisWorldUpTest() {
        World world = new World(10, 10);
        boolean outOfThisWorld = world.isOutOfThisWorld(new Point(10, 11));
        Assertions.assertTrue(outOfThisWorld);
    }

    @Test
    public void isOutOfThisWorldDownTest() {
        World world = new World(10, 10);
        boolean outOfThisWorld = world.isOutOfThisWorld(new Point(10, -1));
        Assertions.assertTrue(outOfThisWorld);
    }
}
