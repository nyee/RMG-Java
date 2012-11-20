package jing.rxnSys;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import jing.chem.ThermoData;
/**
 * This CyclicList class is meant to list out the cyclic species that QMTP would perform calculations on if on
 * It is based heavily on the Logger class
 */
public class CyclicList {
    /** The object representing the log file. */
    private static BufferedWriter logFile = null;
	private static String newLine = System.getProperty("line.separator");
	
    
	public static void initialize() {
	/** The newline character to use. */

	try {
        // Open the log file (throws IOException if unsuccessful)
        logFile = new BufferedWriter(new FileWriter("CyclicList.txt", true));
        Logger.info("Creating Dictionary for Cyclic List");
    	}
    catch (IOException e) {
        // This is pretty essential to new QMTP regime. Stop if it fails
    	Logger.critical("Could not create QM Thermo Dictionary");
        System.exit(0);
    	}

    }
	
    public static void finish() {
        try {
            // Close the log file (throws IOException if unsuccessful)
            logFile.close();
        }
        catch (IOException e) {
			throw new RuntimeException(e);
        }
    }
    
    //Adds a cylic to the list
    public static void addSpecies(String inChI) {
        try {
        	logFile.write(inChI + newLine);
        }
        catch (IOException e) {
			throw new RuntimeException(e);
        }
    	
    }
}
