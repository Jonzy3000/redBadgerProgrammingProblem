package main.java;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            List<String> lines = TextFileReader.read(args[0]);
            InputReader ir = new InputReader(lines);
            World world = ir.getWorld();
            List<Robot> robots = ir.getRobots();
            for (Robot robot : robots) {
                RobotFinalOutput finalOutput = robot.processInstructions(world);
                
                System.out.print(
                        finalOutput.getEndPoint().getX() + " " + finalOutput.getEndPoint().getY() + " "
                                + finalOutput.getEndDirection().getDirection()
                );

                if (finalOutput.isLost()) {
                    System.out.print(" LOST");
                    world.addLostRobot(robot);
                }

                System.out.println("");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
