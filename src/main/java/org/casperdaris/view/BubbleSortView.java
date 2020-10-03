package org.casperdaris.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import org.casperdaris.controller.BubbleSortController;

public class BubbleSortView {

    private Button eenmaligUitvoerenKnop, alleUitvoerenKnop, cijferToevoegenKnop, lijstLeegmakenKnop, printLijstKnop;
    private TextField invoerVeld;

    public BubbleSortView(GridPane view) {

        invoerVeld = new TextField();
        invoerVeld.setPrefWidth(0.3);

        cijferToevoegenKnop = new Button("Toevoegen");
        cijferToevoegenKnop.setOnAction(event -> {
            if (!invoerVeld.getText().isEmpty()) {
                BubbleSortController.intLijst.add(Integer.parseInt(invoerVeld.getText()));
                invoerVeld.clear();
            }
        });

        lijstLeegmakenKnop = new Button("Leegmaken");
        lijstLeegmakenKnop.setOnAction(event -> {
            BubbleSortController.intLijst.clear();
            System.out.println("Lijst opgeschoond");
        });

        printLijstKnop = new Button("Print");
        printLijstKnop.setOnAction(event -> {
            System.out.println(BubbleSortController.intLijst);
        });

        eenmaligUitvoerenKnop = new Button("Eenmalig");
        eenmaligUitvoerenKnop.setOnAction(event -> {
            BubbleSortController.Sorteer(BubbleSortController.intLijst);
        });

        alleUitvoerenKnop = new Button("Voltooien");
        alleUitvoerenKnop.setOnAction(event -> {
            BubbleSortController.SorteerAlles(BubbleSortController.intLijst);
        });

        view.setPrefSize(360, 240);
        view.add(invoerVeld, 0, 0);
        view.add(cijferToevoegenKnop, 1, 0);
        view.add(lijstLeegmakenKnop, 2, 0);
        view.add(printLijstKnop, 0, 1);
        view.add(eenmaligUitvoerenKnop, 1, 1);
        view.add(alleUitvoerenKnop, 2, 1);
        view.setHgap(12);
        view.setVgap(12);
        view.setPadding(new Insets(20, 20, 20, 20));
    }
}
