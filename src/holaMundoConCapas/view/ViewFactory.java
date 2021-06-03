/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

/**
 *
 * @author adrian
 */
public class ViewFactory {
    /**
     * Sent a new view implementation/ new swing view implementation
     * @return a view 
     */
    public static View getView(){
        //return new ViewImplementation();
        //return new NewSwingViewImplementation();
        return new JavaFXViewImplementation();
        
    }
}
