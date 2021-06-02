/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

import javax.swing.JOptionPane;

/**
 *
 * @author 2dam
 */
public class NewSwingViewImplementation implements View{
     public void showGreeting(String greeting){
         JOptionPane.showMessageDialog(null, greeting);
    }
}
