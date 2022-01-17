/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphics;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.stage.Stage;

/**
 *
 * @author nathan
 */
public class Screen extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setMinHeight(800);
            stage.setMinWidth(800);
            stage.show();
        }catch(Exception e){
            System.out.println(e.toString());
            ErrorPopup.throwError("2");
        }
    }

    //Launch the Screen
    public static void launch() {
        String[] args = {};
        Application.launch(args);
    }
}
