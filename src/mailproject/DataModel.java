/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailproject;

import javafx.beans.Observable;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author matteo
 */
public class DataModel {
    private final ObservableList<Email> emailList = FXCollections.observableArrayList(email -> 
        new Observable[] {email.argumentProperty(), email.textProperty(), email.mittenteProperty(), email.destinatarioProperty()});

    private final ObjectProperty<Email> currentEmail = new SimpleObjectProperty<>(null);
    
    public ObjectProperty<Email> currentEmailProperty() {
        return currentEmail ;
    }

    public final Email getCurrentEmail() {
        return currentEmailProperty().get();
    }

    public final void setCurrentEmail(Email email) {
        currentEmailProperty().set(email);
    }
    
    public ObservableList<Email> getEmailList() {
        return emailList ;
    }
    
    public void loadData() {
        emailList.setAll(
                new Email("argomento1", "testo1", "mittente.1@example.com","destinatario.1@example.com"),
                new Email("argomento2", "testo2", "mittente.2@example.com","destinatario.2@example.com"), 
                new Email("argomento3", "testo3", "mittente.3@example.com","destinatario.3@example.com"), 
                new Email("argomento4", "testo4", "mittente.4@example.com","destinatario.4@example.com"), 
                new Email("argomento5", "testo5", "mittente.5@example.com","destinatario.5@example.com")
        );
        currentEmail.set(new Email("null", "null", "null.null@example.com","null.null@example.com"));
    }
}
