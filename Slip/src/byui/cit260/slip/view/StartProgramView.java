/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

/**
 *
 * @author Richard
 */
public class StartProgramView {

    public StartProgramView() {
    }
 
    public void startProgram() {
    /*  startProgram(): void
BEGIN
 Display the banner screen
 Get the players name
 Create a new player
 DISPLAY a customized welcome message
 DISPLAY the main menu
END */
   
    this.displayBanner();
    
    } 

    private void displayBanner() {
        System.out.println("\n\n************************************************");
        
        System.out.println(""
                + "\n Welcome to Slip"
                + "\n In this text based role playing game, "
                + "\n you will be put into a futuristic extreme "
                + "\n camping experience. You will be hiking on Mt. McKinley in Alaska."
                + "\n The goal is to hike to the summit of the mountain. "
                + "\n You will need to battle the environemnt and depression as you summit the mountain.");
                
        }
    
            
}
