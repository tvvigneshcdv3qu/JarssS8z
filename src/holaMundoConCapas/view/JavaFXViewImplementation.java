/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holaMundoConCapas.view;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author 2dam
 */
public class JavaFXViewImplementation extends Application implements View {

    private String greeting;

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("vista.fxml"));
            Parent root = loader.load();
            FXMLDocumentController viewController = ((FXMLDocumentController) loader.getController());
            viewController.setGreeting(greeting);
            viewController.setStage(stage);
            viewController.initStage(root);
            //stage.setOnShowing(FXMLDocumentController::onWindowShowing);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showGreeting(String greeting) {
        launch(greeting);

    }

    @Override
    public void init() throws IOException {
        this.greeting = getParameters().getRaw().get(0);
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

}
