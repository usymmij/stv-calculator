package usymmij.stvcalculator;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataRetrieval {
    private static FileReader file;

    public static void retrieve() throws FileNotFoundException {
        file = new FileReader("data\\votes.txt");
    }

}
