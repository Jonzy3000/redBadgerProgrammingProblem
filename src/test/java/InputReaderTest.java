package test.java;

import main.java.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class InputReaderTest {

    @Test
    public void readWorldTestInput1(){
        InputReader ir = new InputReader(Inputs.input1);
        World world = ir.getWorld();
        Assertions.assertEquals(world.getUpperRightPoint().getX(), 5);
        Assertions.assertEquals(world.getUpperRightPoint().getY(), 3);
    }

    @Test
    public void realWorldTestInput2() {
        InputReader ir = new InputReader(Inputs.input2);
        World world = ir.getWorld();
        Assertions.assertEquals(world.getUpperRightPoint(), new Point(10, 10));
    }
}
