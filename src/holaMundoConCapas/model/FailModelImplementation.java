/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.model;


import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class FailModelImplementation implements Model{

    @Override
    public String getGreeting() {
       
        String greet=ResourceBundle.getBundle("holaMundoConCapas.model.Properties").getString("greeting");
        
        
        return greet;
        
                
    }
    
}
