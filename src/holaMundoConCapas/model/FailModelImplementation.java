/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.model;


import java.util.ResourceBundle;

/**
 *
 * @author adrian
 */
public class FailModelImplementation implements Model{
    /**
     * Give me the greet
     * @return the greet
     */
    @Override
    public String getGreeting() {
       
        String greet=ResourceBundle.getBundle("holaMundoConCapas.model.Properties").getString("greeting");
        
        
        return greet;
        
                
    }
    
}
