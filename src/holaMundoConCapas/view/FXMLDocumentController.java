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
 *
 * @author 2dam
 */
/**
 * control from JavaFX vieew implementation
 *
 */
public class FXMLDocumentController {

    @FXML
    private Label textoPositivo;
    

    private String greeting;
    private Stage stage;

    @FXML
    private void onClose(ActionEvent event) {
        Platform.exit();
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    
    public void initStage(Parent root){
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.setOnShowing(this::onWindowShowing);
        stage.show();
    }

    public void onWindowShowing(WindowEvent e){
        textoPositivo.setText(greeting);
    }

    void setStage(Stage stage) {
        this.stage=stage;
    }

    

}
