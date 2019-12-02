import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class MyApplication extends Application {
    @Override
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        Label label = new Label("Tik een woord in om een palindroom te genereren: ");
        TextField text = new TextField();
        Button knop = new Button("Genereer");
        Label tekststuk = new Label("Jouw Palindroom is: ");


        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String str = text.getText();
                String output = Palindroom.setPalindroom(str);
                tekststuk.setText("Jouw Palindroom:  " + output);
            }
        };
        knop.setOnAction(event);

        grid.add(label, 1, 1);
        grid.add(text, 2, 1);
        grid.add(knop, 1, 3);
        grid.add(tekststuk, 1, 4);

        grid.setVgap(3.5);
        grid.setHgap(3);
        Scene mainview = new Scene(grid);
        stage.setScene(mainview);
        stage.show();


    }
}