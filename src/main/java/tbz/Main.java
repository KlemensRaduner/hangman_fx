package tbz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hangman");
        FXMLLoader loader = new FXMLLoader();
        AnchorPane root  = loader.load(getClass().getResource("/welcome_window.fxml"));
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}

