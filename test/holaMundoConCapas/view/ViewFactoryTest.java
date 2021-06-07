/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Tests the ViewFactory
 * @author Adrian Corral
 */
public class ViewFactoryTest {
  

    /**
     * Test of getView method, of class ViewFactory with a Not Null coincidence
     */
    @Test
    public void testGetView() {
        assertNotNull("ViewFactory returns a null View object!!!",ViewFactory.getView());
    }
    
}
