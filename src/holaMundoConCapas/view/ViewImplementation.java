/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

/**
 * This class implements the interface View
 * @author Adrian Corral
 */
public class ViewImplementation implements View {
    /**
     * The method shows the greet into the console
     * @param greeting 
     */
    public void showGreeting(String greeting) {
        System.out.println(greeting);
    }
}
