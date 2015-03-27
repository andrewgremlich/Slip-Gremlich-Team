/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slip;

import byui.cit260.slip.model.Game;
import byui.cit260.slip.model.Player;
import byui.cit260.slip.view.ErrorView;
import byui.cit260.slip.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Richard
 */
public class Slip {

    private static Game currentGame = new Game();
    private static Player player = new Player();

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            //open character stream files for end user input and output
            Slip.inFile = new BufferedReader(new InputStreamReader(System.in));
            Slip.outFile = new PrintWriter(System.out, true);

            //open log file
            String filePath = "log.txt";
            Slip.logFile = new PrintWriter(filePath);

        } catch (Exception e) {
            System.out.println("Error closing files");

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            return;
        } finally {
            try {
                if (Slip.inFile != null) {
                    Slip.inFile.close();

                    if (Slip.outFile != null) {
                        Slip.outFile.close();
                    }
                }

            } catch (IOException ex) {
                Logger.getLogger(Slip.class.getName()).log(Level.SEVERE, null, ex);

            }

        }

        StartProgramView startProgramView = new StartProgramView();

        try {
            startProgramView.display();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.display();
        }

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentgame) {
        Slip.currentGame = currentgame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Slip.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Slip.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Slip.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Slip.logFile = logFile;
    }

}
