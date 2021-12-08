/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphics;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

/**
 *
 * @author nathan
 */
public class ErrorPopup {
    public static void throwError(String error){
        Alert alert;
        switch(error){
            case "1":
                alert = new Alert(Alert.AlertType.ERROR, "Failed to switch screens", ButtonType.OK);
                     alert.showAndWait();
                     break;
            case "2":
                alert = new Alert(Alert.AlertType.ERROR, "Fail To Load Scenes", ButtonType.OK);
                     alert.showAndWait();
                     break;
        }
    }
}
