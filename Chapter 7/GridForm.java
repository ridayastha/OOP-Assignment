import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridForm extends Application {

    public void start(Stage stage) {

        Label nameLabel = new Label("Name:");
        Label ageLabel = new Label("Age:");

        TextField nameField = new TextField();
        TextField ageField = new TextField();

        Button submit = new Button("Submit");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(ageLabel, 0, 1);
        grid.add(ageField, 1, 1);
        grid.add(submit, 1, 2);

        Scene scene = new Scene(grid, 300, 200);

        stage.setTitle("GridPane Form");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}