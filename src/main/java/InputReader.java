package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputReader {
    private World world;
    private List<Robot> robots = new ArrayList<>();

    public InputReader(List<String> input) {
        String coords = input.get(0);
        readMapSize(coords);

        for (int i = 1; i < input.size(); i += 2) {
            List<String> robotDetails = Arrays.asList(input.get(i), input.get(i + 1));
            readRobotDetails(robotDetails);
        }
    }

    private void readMapSize(String string) {
        List<Integer> coords = new ArrayList<>();
        String[] numbers = string.split(" ");
        for (String number : numbers) {
            coords.add(Integer.valueOf(number));
        }

        this.world = new World(coords.get(0), coords.get(1));
    }

    private CompassDirection getInitialDirection(String line) {
        return CompassDirection.get("" + line.charAt(line.length() - 1));
    }

    private Point getInitialCoords(String line) {
        List<Integer> coords = new ArrayList<>();
        String[] numbers = line.split(" ");
        for (String number : numbers) {
            coords.add(Integer.valueOf(number));
        }

        return new Point(coords.get(0), coords.get(1));
    }

    private List<RobotInstruction> getRobotInstructions(String instructions) {
        List<RobotInstruction> retVal = new ArrayList<>();

        for (int i = 0; i < instructions.length(); i++) {
            RobotInstruction instruction = RobotInstruction.get(instructions.charAt(i) + "");
            retVal.add(instruction);
        }

        return retVal;
    }

    private void readRobotDetails(List<String> lines) {
        String robotStartingPosition = lines.get(0);
        CompassDirection compassDirection = getInitialDirection(robotStartingPosition);
        Point initialCoords = getInitialCoords(robotStartingPosition.substring(0, robotStartingPosition.length() - 2));

        String instructions = lines.get(1);
        List<RobotInstruction> robotInstructions = getRobotInstructions(instructions);

        this.robots.add(new Robot(initialCoords, compassDirection, robotInstructions));
    }

    public World getWorld() {
        return world;
    }

    public List<Robot> getRobots() {
        return robots;
    }
}
