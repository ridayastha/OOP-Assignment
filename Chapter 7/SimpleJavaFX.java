import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleJavaFX extends Application {

    public void start(Stage stage) {

        Label label = new Label("Welcome to JavaFX");
        Button button = new Button("Click Me");

        TextField textField = new TextField();
        textField.setPromptText("Enter text");

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, textField, button);

        Scene scene = new Scene(layout, 300, 200);

        stage.setTitle("Simple JavaFX App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}