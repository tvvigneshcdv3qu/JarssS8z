/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas;

import holaMundoConCapas.controler.Controller;
import holaMundoConCapas.model.ModelFactory;
import holaMundoConCapas.view.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {
    public static void main(String[]args){
        Controller controlador=
                new Controller();
        controlador.run(ViewFactory.getView(), ModelFactory.getModel());
    }
    
}
