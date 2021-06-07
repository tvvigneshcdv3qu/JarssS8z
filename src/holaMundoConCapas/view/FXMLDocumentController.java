/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 * control from JavaFX vieew implementation
 * @author Adrian Corral
 */
public class FXMLDocumentController {
    
    @FXML
    private Label textoPositivo;
    

    private String greeting;
    private Stage stage;
    
    /**
     * When you close the app this change the label texto positivo
     * @param event 
     */
    @FXML
    private void onClose(ActionEvent event) {
        textoPositivo.setText(greeting+greeting);
    }
    
    /**
     * Set the greeting of this class recibed from other class
     * @param greeting 
     */
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    /**
     * Shows the window initilizing all their components
     * @param root 
     */
    public void initStage(Parent root){
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this::onWindowShowing);
        stage.show();
    }

    /**
     * When you shows the window shows a text on the label textoPositivo
     * @param e 
     */
    public void onWindowShowing(WindowEvent e){
        textoPositivo.setText(greeting);
    }
    
    /**
     * Set the stage for this class
     * @param stage 
     */
    public void setStage(Stage stage) {
        this.stage=stage;
    }

    

}
