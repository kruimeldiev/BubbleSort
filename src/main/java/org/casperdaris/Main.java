package org.casperdaris;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.casperdaris.controller.BubbleSortController;
import org.casperdaris.view.BubbleSortView;

/**
 * JavaFX App
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {

        GridPane root = new GridPane();
        Scene scene = new Scene(root);
        new BubbleSortView(root);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}