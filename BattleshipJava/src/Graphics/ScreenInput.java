/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

/**
 *
 * @author nathan
 */
public class ScreenInput {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML
    private AnchorPane mapVeiwIcon;

    //switchs to menu screen
    public void toMenu(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Menu.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            ErrorPopup.throwError("1");
        }
    }
    //switchs to battle screen
    public void toBattleScreen(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("BattleScreen.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            ErrorPopup.throwError("1");
        }
    }
    //switchs to settings screen
    public void toSettings(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
        } catch (Exception e) {
            ErrorPopup.throwError("1");
        }
    }
    //switchs to menu screen
    public void exitGame(ActionEvent event) {
        System.exit(0);
    }
    //switchs which battle screen is being veiwed
    private String iconImageChange= "-fx-background-image: url('/Sprits/fleet.png'); -fx-background-size: stretch; -fx-background-repeat: no-repeat; -fx-background-position: center;";
    public void switchBattleScreen(ActionEvent event){
        String holder = mapVeiwIcon.getStyle();
        mapVeiwIcon.setStyle(iconImageChange);
        iconImageChange = holder;
        System.out.println(holder);
    }
}
