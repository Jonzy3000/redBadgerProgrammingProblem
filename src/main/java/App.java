package main.java;

import java.io.IOException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        try {
            List<String> lines = TextFileReader.read(args[0]);
            new InputReader(lines);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
