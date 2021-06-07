/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.model;

/**
 *
 * @author 2dam
 */

public class ModelImplementation implements Model{
    /**
     * Code the mothod declared on the interface model and return a string greet
     * @return greet
     */
    @Override
    public String getGreeting(){
        String greet="Hola Mundo";
        return greet;
    }
}
