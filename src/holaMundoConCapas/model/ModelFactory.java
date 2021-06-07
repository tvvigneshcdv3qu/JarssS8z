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
public class ModelFactory {
    /**
     * Return a new model implementation 
     * @return a model class
     */
    public static Model getModel(){
        //return new ModelImplementation();
        return new FailModelImplementation();
    }
    
}
