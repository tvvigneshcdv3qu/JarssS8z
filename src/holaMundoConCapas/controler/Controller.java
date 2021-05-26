/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.controler;

import holaMundoConCapas.model.Model;
import holaMundoConCapas.view.View;

/**
 *
 * @author 2dam
 */
public class Controller {
    public void run(View vista,Model modelo){
        String greeting="";
        greeting=modelo.getGreeting();
        vista.showGreeting(greeting);
    }
    
}
