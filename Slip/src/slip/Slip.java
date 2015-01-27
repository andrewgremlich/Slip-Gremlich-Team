/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slip;

import byui.cit260.slip.model.Player;

/**
 *
 * @author Richard
 */
public class Slip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Andrew Richard");
        playerOne.setBestTime(7.00);
        playerOne.setAttackingPower(10.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
    }
    
}
