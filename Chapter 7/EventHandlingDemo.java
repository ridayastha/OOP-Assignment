import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandlingDemo extends Application {

    public void start(Stage stage) {

        Label label = new Label("Click the button");
        Button button = new Button("Click Me");

        button.setOnAction(e -> {
            label.setText("Button Clicked!");
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, button);

        Scene scene = new Scene(layout, 300, 200);

        stage.setTitle("Event Handling Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}