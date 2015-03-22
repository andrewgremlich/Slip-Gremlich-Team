/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.slip.exceptions;

/**
 *
 * @author Andrew
 */
public class FactorControlException extends Exception {

    public FactorControlException(String message) {
        super(message);
    }

    public FactorControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FactorControlException(Throwable cause) {
        super(cause);
    }

    public FactorControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
