package usymmij.stvcalculator;

/**
 * STV voting calculator
 * 
 * Calculates winners from a poll using the Single Transferable Vote algorithm
 * 
 * put poll data in votes.txt in the format
 *      [choice 1]  [choice 2]  [choice 3]
 *      [choice 1]  [choice 2]
 *      [choice 1]  [choice 2]  [choice 3]  [choice 4]
 * so that tabs are in between each vote choice and each voter is a new line
 * copy pasting from google sheets or excel should export in this format
 *
 * usymmij 2019
 */

public class STV {

    public static void main(String[] args) {
        //sets up variables
        Election.prep();
        //reads file
        Election.retrieveData();
    }
}