package test.java;

import main.java.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RobotInstructionsTest {
    private final World world = new World(5, 3);

    @Test
    public void aroundInCircles() {
        Robot robot = new Robot(
                new Point(1, 1),
                CompassDirection.EAST,
                Arrays.asList(
                        RobotInstruction.RIGHT,
                        RobotInstruction.FORWARD,
                        RobotInstruction.RIGHT,
                        RobotInstruction.FORWARD,
                        RobotInstruction.RIGHT,
                        RobotInstruction.FORWARD,
                        RobotInstruction.RIGHT,
                        RobotInstruction.FORWARD
                )
        );

        RobotFinalOutput output = robot.processInstructions(world);

        Assertions.assertEquals(output.getEndDirection(), CompassDirection.EAST);
        Assertions.assertEquals(output.getEndPoint(), new Point(1, 1));
        Assertions.assertFalse(output.isLost());
    }

    @Test
    public void lostTest() {
        Robot robot = new Robot(
                new Point(3, 2),
                CompassDirection.NORTH,
                Arrays.asList(
                        RobotInstruction.FORWARD,
                        RobotInstruction.RIGHT,
                        RobotInstruction.RIGHT,
                        RobotInstruction.FORWARD,
                        RobotInstruction.LEFT,
                        RobotInstruction.LEFT,
                        RobotInstruction.FORWARD,
                        RobotInstruction.FORWARD,
                        RobotInstruction.RIGHT,
                        RobotInstruction.RIGHT,
                        RobotInstruction.FORWARD,
                        RobotInstruction.LEFT,
                        RobotInstruction.LEFT
                )
        );

        RobotFinalOutput output = robot.processInstructions(world);

        Assertions.assertEquals(output.getEndDirection(), CompassDirection.NORTH);
        Assertions.assertEquals(output.getEndPoint(), new Point(3, 3));
        Assertions.assertTrue(output.isLost());
    }
}
