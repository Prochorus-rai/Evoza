package com.evoza;
import com.evoza.ui.CustomTitleBar;
import com.evoza.ui.LandingPageUI;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.InputStream;
import javafx.scene.layout.BorderPane;
import javafx.stage.StageStyle;




public class EvozaApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.initStyle(StageStyle.UNDECORATED); // Remove default title bar

            VBox root = new LandingPageUI().start(primaryStage);
            BorderPane borderPane = new BorderPane();
            borderPane.setTop(new CustomTitleBar(primaryStage)); // Add custom title bar
            borderPane.setCenter(root);

            Scene scene = new Scene(borderPane, 1024, 768);
            scene.getStylesheets().add(getClass().getResource("/css/app.css").toExternalForm());

            primaryStage.setTitle("Evoza Web Browser");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false); // Allow resizing


            // Set the application icon
            InputStream iconStream = getClass().getResourceAsStream("/images/icons/logo.png");
            if (iconStream == null) {
                System.err.println("Icon resource not found!");
            } else {
                primaryStage.getIcons().add(new Image(iconStream));
            }

            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}