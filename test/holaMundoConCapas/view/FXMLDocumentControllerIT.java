/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

import javafx.stage.Stage;
import org.junit.Test;
import static org.testfx.api.FxAssert.verifyThat;
import org.testfx.framework.junit.ApplicationTest;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

/**
 *
 * @author 2dam
 */
public class FXMLDocumentControllerIT extends ApplicationTest{
    
    @Override
    public void start(Stage stage) throws Exception{
    JavaFXViewImplementation myApp= new JavaFXViewImplementation();
    myApp.setGreeting("Hola Mundo con propiedades");
    myApp.start(stage);
    
    
    }
    @Test
    public void testLabelHasGreeting() {
        verifyThat("#textoPositivo",hasText("Hola Mundo con propiedades"));
    }
    
    @Test
    public void testButtonClic(){
        clickOn("#botonIndiferente");
        verifyThat("#textoPositivo",hasText("Hola Mundo con propiedades"+"Hola Mundo con propiedades"));
       
    }
    
}
