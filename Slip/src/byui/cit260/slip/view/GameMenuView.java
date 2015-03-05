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
public class GameMenuView extends View {

    private final String GAMEVIEW = "";

    public GameMenuView() {
        super(GAMEVIEW);
    }

    public GameMenuView(String promptMessage) {
        super(promptMessage);
    }

    @Override
    public void display() {
        System.out.println("\n*** displayMenu Stub function called *** ");
    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
