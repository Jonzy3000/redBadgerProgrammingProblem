package main.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TextFileReader {
    static List<String> read(String path) throws IOException {
        List<String> input = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null) {
                input.add(line.trim());
                line = br.readLine();
            }

            return input;
        }
    }
}
