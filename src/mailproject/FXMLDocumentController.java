/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.ListView;

/**
 *
 * @author matteo
 */
public class FXMLDocumentController{
    
    @FXML
    private TextArea objectField;
    @FXML
    private TextArea senderField;
    @FXML
    private TextArea contentField;
    
    private DataModel model ;
    
    public void initModel(DataModel model) {
        // ensure model is only set once:
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }

        this.model = model ;
//        model.currentEmailProperty().addListener((obs, oldEmail, newEmail) -> {
//            if (oldEmail != null) {
//                objectField.textProperty().unbindBidirectional(oldEmail.argumentProperty());
//            }
//            if (newEmail == null) {
//                objectField.setText("");
//            } else {
//                objectField.textProperty().bindBidirectional(newEmail.argumentProperty());
//            }
//        });
//        model.currentEmailProperty().addListener((obs, oldEmail, newEmail) -> {
//            if (oldEmail != null) {
//                senderField.textProperty().unbindBidirectional(oldEmail.mittenteProperty());
//            }
//            if (newEmail == null) {
//                senderField.setText("");
//            } else {
//                senderField.textProperty().bindBidirectional(newEmail.mittenteProperty());
//            }
//        });
//        model.currentEmailProperty().addListener((obs, oldEmail, newEmail) -> {
//            if (oldEmail != null) {
//                contentField.textProperty().unbindBidirectional(oldEmail.textProperty());
//            }
//            if (newEmail == null) {
//                contentField.setText("");
//            } else {
//                contentField.textProperty().bindBidirectional(newEmail.textProperty());
//            }
//        });
    }

    
}
