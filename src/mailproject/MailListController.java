/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailproject;

import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author matteo
 */
public class MailListController{

    @FXML
    private ListView<Email> mailList ;
    
    private DataModel model ;
    
    public void initModel(DataModel model){
        // ensure model is only set once:
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }

        this.model = model ;
        mailList.setItems(model.getEmailList());

        mailList.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> 
            model.setCurrentEmail(newSelection));

        model.currentEmailProperty().addListener((obs, oldMail, newMail) -> {
            if (newMail == null) {
                mailList.getSelectionModel().clearSelection();
            } else {
                mailList.getSelectionModel().select(newMail);
            }
        });
        
        mailList.setCellFactory(lv -> new ListCell<Email>() {
            @Override
            public void updateItem(Email email, boolean empty) {
                super.updateItem(email, empty);
                if (empty) {
                    setText(null);
                } else {
                    setText(email.getArgument() + " " + email.getText() + " " + email.getMittente());
                }
            }
        });
        
    }
}

