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
public class MountainView extends View {

    public MountainView() {
        super("\n West Face of Mount McKinley."
                + "\n  (highest peak in N. America)                       "
                + "\n                                                    A"
                + "\n                                                     /\\_,"
                + "\n                                            ______,-' .::\\__"
                + "\n                                 _,--------'      (_    .:::\\__"
                + "\n                 B   /\\_       _/           :::.    \\_   ':'   '-,_"
                + "\n               _/\\-^/::.'-,C__/     :::.   H ::       \\_           \\ F"
                + "\n         -^-,_/ \"-_/::::  \\_         ::       :.        \\___       .\\"
                + "\n     ,--^^--/          .:::      \\       G:.       :            \\_    .::\\"
                + "\n    / .:   |     .:   .::        _)        :                      :\\     ::\\"
                + "\n     :::       .:           _,-' |                                 .:\\ I  .::\\"
                + "\n    .:                  _,-' .::: \\                   .::           :\\_    ::|_"
                + "\n                  E|'  .::  :.  |                      ::     ::\\  .::\\_   .::\\"
                + "\n                 ,-^-,::.    ::. \\                     '     '::\\   .::\\-,  ::\\"
                + "\n               _/    \\  ::.       |                         .:'::\\    '::\\   -'\\"
                + "\n            ,-'       \\            \\                           ::\\    .::\\_  ::"
                + "\n           /       :   \\            \\_                               .::::'_     ::-_"
                + "\n         ,'   . J  ::   \\                                              .::::^      ::-_"
                + "\n        /    :     :     \\"
                + "\n       |    ::      ::    \\  D"
                + "\n     _/    .:'"
                + "\n    '"
                + "\n***********Legend***********"
                + "\nA : South Summit. (6194m)"
                + "\nB : North Summit. (5935m)"
                + "\nC : Denali Pass."
                + "\nD : Windy Corner--Base Camp Start"
                + "\nE : The West Buttress--Elf"
                + "\nF : Cassin Ridge—Santa Claus"
                + "\nG : Hourglass Culoir."
                + "\nH : Messner Corner."
                + "\nI : The West Rib--Abominable Snowman"
                + "\nJ : Thunder Ridge."
                + "\n"
                + "\nPress Q to exit.");

    }

    public MountainView(String promptMessage) {
        super(promptMessage);
    }

    @Override
    public boolean doAction(Object obj) {
        char selection = ((String) obj).toLowerCase().charAt(0);
        switch (selection) {
            case 'q': //return to main menu
                return true;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid Selection *** Please Try again");
                return false; //To change body of generated methods, choose Tools | Templates.
        }

    }
}
