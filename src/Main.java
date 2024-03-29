import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage stage) throws Exception{
       Parent root = FXMLLoader.load(getClass().getResource("notes.fxml"));
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        stage.setTitle("Relax Notes");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.getIcons().add(new Image("notebook.png"));
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
