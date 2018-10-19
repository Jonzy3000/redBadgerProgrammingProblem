package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class InputReaderTest {
    final List<String> input = Arrays.asList(
            "5 3",
            "1 1 E",
            "RFRFRFRF",
            "3 2 N",
            "FRRFLLFFRRFLL",
            "0 3 W",
            "LLFFFLFLFL"
    );

    @Test
    public void readWorldTest(){
        InputReader ir = new InputReader(input);
        World world = ir.getWorld();
        Assertions.assertEquals(world.getUpperRightPoint().getX(), 5);
        Assertions.assertEquals(world.getUpperRightPoint().getY(), 3);
    }
}
