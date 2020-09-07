package org.casperdaris.view;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import org.casperdaris.controller.BubbleSortController;

public class BubbleSortView {

    private Button knop;

    public BubbleSortView(GridPane view) {

        knop = new Button("Uitvoeren");
        knop.setOnAction(event -> {
            BubbleSortController.Sorteer(BubbleSortController.intArray);
        });

        view.setPrefSize(360, 240);
        view.add(knop, 0, 0);
    }
}
