/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.controler;

import holaMundoConCapas.model.Model;
import holaMundoConCapas.view.View;
import java.util.logging.Logger;

/**
 *  Controller calss for Hello world with Tiers
 * @author adrian corral
 */
public class Controller {
    private static final Logger LOGGER=Logger.getLogger("holaMundoConCapas.controler.Controller");
    /**
     * This method executes the aplication and shows the greeting on the view 
     * @param vista the view object
     * @param modelo  the model object
     */
    public void run(View vista,Model modelo){
    try{
        LOGGER.info("Start the method run of the Controller");
        String greeting="";
        greeting=modelo.getGreeting();
        vista.showGreeting(greeting);
        LOGGER.info("Ending the method run of the Controller");
    }catch(Exception e){
        LOGGER.severe(e.getMessage());
    }
    }
    
}
