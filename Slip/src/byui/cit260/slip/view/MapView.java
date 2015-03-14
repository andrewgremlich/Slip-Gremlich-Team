/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.view;

/**
 *
 * @author Andrew
 */
public class MapView extends View {

    public MapView(String promptMessage) {
        super("\n"
                + "\n-------------------------------"
                + "\n| Slip Map    |"
                + "\n-------------------------------"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|"
                + "\n|_|_|_|_|_|_|_|_|_|_|");
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
