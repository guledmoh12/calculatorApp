//Imports
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//Controller Class
public class calculatorApp extends Application{
    public void start(Stage primaryStage) {

        //Stage initialization.
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(new Pane(), 300, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}