/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

import javax.swing.JOptionPane;

/**
 * Swing implementation on our tiers app
 * @author Adrian Corral
 */
public class NewSwingViewImplementation implements View{
    /**
     * Shows the greeting on one panel created for the system using JOptionPane
     * @param greeting 
     */
     public void showGreeting(String greeting){
         JOptionPane.showMessageDialog(null, greeting);
    }
}
