/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

import java.io.PrintWriter;
import slip.Slip;

/**
 *
 * @author Andrew
 */
public class ErrorView {
    
    private static final PrintWriter logFile = Slip.getLogFile();
    private static final PrintWriter errorFile = Slip.getOutFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                        "-------------------------------------------------------"
                        + "\n - ERROR - " + errorMessage
                        + "\n---------------------------------------------------");
        
        //log error
        logFile.println(className + " - " + errorMessage);
    }
    
}
