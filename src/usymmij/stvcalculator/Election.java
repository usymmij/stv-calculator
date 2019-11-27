package usymmij.stvcalculator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Election {
    private static int positions;

    //getters and setters

    /**
     * gets positions
     * @return the number of available positions for the candidates
     */
    public static int getPositions() {
        return positions;
    }

    /**
     * sets the number of positions
     * should only be run once in the beginnning
     */
    private static void setPositions() {
        positions = getIntInput("How many positions are available?");
    }

    //public superstructure methods

    /**
     * prepares poll, creates nessecary objects and variables
     */
    public static void prep() {
        setPositions();
    }

    public static void retrieveData() {
        try {
            DataRetrieval.retrieve();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("votes.txt not found");
        }
    }

    //private small methods

    /**
     * Scans the integer input from command line 
     * @param query message explaining what to send
     * @return the number recieved
     */
    private static int getIntInput(final String query) {
        System.out.println(query);
        final Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        in.close();
        return input;
    }

}