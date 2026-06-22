import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    public void start(Stage stage) {

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");

        HBox hbox = new HBox(10);
        hbox.getChildren().addAll(b1, b2);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(hbox, b3);

        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("HBox & VBox Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}