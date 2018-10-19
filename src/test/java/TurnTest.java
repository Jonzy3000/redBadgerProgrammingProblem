package test.java;

import main.java.CompassDirection;
import main.java.RobotInstruction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TurnTest {

    @Test
    public void rightTurn() {
        CompassDirection cd = CompassDirection.EAST;
        CompassDirection directionAfterTurn = cd.getDirection(RobotInstruction.RIGHT);

        Assertions.assertEquals(directionAfterTurn, CompassDirection.SOUTH);

        directionAfterTurn = directionAfterTurn.getDirection(RobotInstruction.RIGHT);
        Assertions.assertEquals(directionAfterTurn, CompassDirection.WEST);

        directionAfterTurn = directionAfterTurn.getDirection(RobotInstruction.RIGHT);
        Assertions.assertEquals(directionAfterTurn, CompassDirection.NORTH);

        directionAfterTurn = directionAfterTurn.getDirection(RobotInstruction.RIGHT);
        Assertions.assertEquals(directionAfterTurn, CompassDirection.EAST);
    }

    @Test
    public void leftTurn() {
        CompassDirection cd = CompassDirection.EAST;
        CompassDirection directionAfterTurn = cd.getDirection(RobotInstruction.LEFT);

        Assertions.assertEquals(directionAfterTurn, CompassDirection.NORTH);

        directionAfterTurn = directionAfterTurn.getDirection(RobotInstruction.LEFT);
        Assertions.assertEquals(directionAfterTurn, CompassDirection.WEST);

        directionAfterTurn = directionAfterTurn.getDirection(RobotInstruction.LEFT);
        Assertions.assertEquals(directionAfterTurn, CompassDirection.SOUTH);

        directionAfterTurn = directionAfterTurn.getDirection(RobotInstruction.LEFT);
        Assertions.assertEquals(directionAfterTurn, CompassDirection.EAST);
    }

    @Test
    public void forward() {
        CompassDirection cd = CompassDirection.EAST;
        CompassDirection directionAfterTurn = cd.getDirection(RobotInstruction.FORWARD);

        Assertions.assertEquals(directionAfterTurn, CompassDirection.EAST);
    }
}
