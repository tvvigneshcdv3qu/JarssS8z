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
 *  Test with TestFx the controller of FXML Document and 
 * needs extends the ApplicationTest class
 * @author Adrian Corral
 */
public class FXMLDocumentControllerIT extends ApplicationTest{
    /**
     * Start the start method of the controller using JavaFX, set the greeting 
     * and initialize the window
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception{
    JavaFXViewImplementation myApp= new JavaFXViewImplementation();
    myApp.setGreeting("Hola Mundo con propiedades");
    myApp.start(stage);
    }
    
    /**
     * Verify if the label texto positivo its equals that our text
     */
    @Test
    public void testLabelHasGreeting() {
        verifyThat("#textoPositivo",hasText("Hola Mundo con propiedades"));
    }
    
    /**
     * Click on the button boton indiferente and verify if the text 
     * in the label its equals to our text
     */
    @Test
    public void testButtonClic(){
        clickOn("#botonIndiferente");
        verifyThat("#textoPositivo",
                hasText("Hola Mundo con propiedades"+"Hola Mundo con propiedades"));
       
    }
    
}
