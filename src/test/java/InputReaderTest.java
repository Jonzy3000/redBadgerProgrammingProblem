package test.java;

import main.java.InputReader;
import main.java.Point;
import main.java.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
