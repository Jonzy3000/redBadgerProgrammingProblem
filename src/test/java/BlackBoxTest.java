package test.java;

import main.java.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackBoxTest {

    @Test
    public void input1Test() {
        InputReader ir = new InputReader(Inputs.input1);
        World world = ir.getWorld();
        List<Robot> robots = ir.getRobots();
        List<RobotFinalOutput> expectedResults = Arrays.asList(
                new RobotFinalOutput(
                        new Point(1, 1),
                        CompassDirection.EAST,
                        false
                ),
                new RobotFinalOutput(
                        new Point(3, 3),
                        CompassDirection.NORTH,
                        true
                ),
                new RobotFinalOutput(
                        new Point(2, 3),
                        CompassDirection.SOUTH,
                        false
                )
        );

        List<RobotFinalOutput> actualResults = new ArrayList<>();
        for (Robot robot : robots) {
            RobotFinalOutput finalOutput = robot.processInstructions(world);
            if (finalOutput.isLost()) {
                world.addLostRobot(robot);
            }

            actualResults.add(finalOutput);
        }

        Assertions.assertEquals(actualResults.size(), expectedResults.size());
        for (int i = 0; i < actualResults.size(); i++) {
            RobotFinalOutput expected = expectedResults.get(i);
            RobotFinalOutput actual = actualResults.get(i);

            Assertions.assertEquals(expected, actual);
        }
    }

    @Test
    public void input2Test() {
        InputReader ir = new InputReader(Inputs.input2);
        World world = ir.getWorld();
        List<Robot> robots = ir.getRobots();

        List<RobotFinalOutput> expectedResults = Arrays.asList(
                new RobotFinalOutput(
                        new Point(10, 9),
                        CompassDirection.EAST,
                        true
                ),
                new RobotFinalOutput(
                        new Point(10, 10),
                        CompassDirection.NORTH,
                        true
                ),
                new RobotFinalOutput(
                        new Point(9, 8),
                        CompassDirection.SOUTH,
                        false
                ),
                new RobotFinalOutput(
                        new Point(0, 0),
                        CompassDirection.SOUTH,
                        true
                )
        );

        List<RobotFinalOutput> actualResults = new ArrayList<>();
        for (Robot robot : robots) {
            RobotFinalOutput finalOutput = robot.processInstructions(world);
            if (finalOutput.isLost()) {
                world.addLostRobot(robot);
            }
            actualResults.add(finalOutput);
        }

        Assertions.assertEquals(actualResults.size(), expectedResults.size());
        for (int i = 0; i < actualResults.size(); i++) {
            RobotFinalOutput expected = expectedResults.get(i);
            RobotFinalOutput actual = actualResults.get(i);

            Assertions.assertEquals(expected, actual);
        }
    }
}
