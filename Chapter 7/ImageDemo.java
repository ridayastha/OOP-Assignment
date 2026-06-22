import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ImageDemo extends Application {

    public void start(Stage stage) {

        Image image = new Image("file:sample.jpg"); // put image in same folder
        ImageView imageView = new ImageView(image);

        imageView.setFitHeight(200);
        imageView.setFitWidth(200);

        VBox layout = new VBox(imageView);

        Scene scene = new Scene(layout, 300, 300);

        stage.setTitle("ImageView Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}