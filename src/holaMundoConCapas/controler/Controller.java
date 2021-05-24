/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.controler;

/**
 *
 * @author 2dam
 */
public class Controller {
    public void run(){
        String greeting="";
        holaMundoConCapas.model.ModelImplementation modelo=new holaMundoConCapas.model.ModelImplementation();
        holaMundoConCapas.view.ViewImplementation vista=new holaMundoConCapas.view.ViewImplementation();
        greeting=modelo.getGreeting();
        vista.showGreeting(greeting);
    }
    
}
