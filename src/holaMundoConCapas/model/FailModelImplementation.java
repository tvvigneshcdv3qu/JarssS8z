/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.model;


import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 *
 * @author adrian corral
 */
public class FailModelImplementation implements Model{
    private static final Logger LOGGER=Logger.getLogger("holaMundoConCapas.controler.Controller");
    /**
     * Give me the greet
     * @return the greet
     */
    @Override
    public String getGreeting() {
       LOGGER.info("Searching on the properties file");
        String greet=ResourceBundle.getBundle("holaMundoConCapas.model.Properties").getString("greeting");
        
        
        return greet;
        
                
    }
    
}
