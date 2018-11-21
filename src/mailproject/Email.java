/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailproject;

import java.util.Calendar;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author matteo
 */
public class Email {
    private static int ID;
    private final StringProperty argument = new SimpleStringProperty();
    
    public final StringProperty argumentProperty(){
        return this.argument;
    }
    
    public final String getArgument() {
        return this.argumentProperty().get();
    }

    public final void setArgument(final String argument) {
        this.argumentProperty().set(argument);
    }

    
    private final StringProperty text = new SimpleStringProperty();
    
    public final StringProperty textProperty(){
        return this.text;
    }
    
    public final String getText() {
        return this.textProperty().get();
    }

    public final void setText(final String text) {
        this.textProperty().set(text);
    }
    
    private final StringProperty mittente = new SimpleStringProperty();
    
     public final StringProperty mittenteProperty(){
        return this.mittente;
    }
    
    public final String getMittente() {
        return this.mittenteProperty().get();
    }

    public final void setMittente(final String mittente) {
        this.mittenteProperty().set(mittente);
    }
    
    
    private final StringProperty destinatario = new SimpleStringProperty();

    public final StringProperty destinatarioProperty(){
        return this.destinatario;
    }
    
    public final String getDestinatario() {
        return this.destinatarioProperty().get();
    }

    public final void setDestinatario(final String destinatario) {
        this.destinatarioProperty().set(destinatario);
    }
    
    private Calendar dataSpedizione;
    
    public Calendar getDataSpedizione() {
        return dataSpedizione;
    }

    public void setDataSpedizione(Calendar dataSpedizione) {
        this.dataSpedizione = dataSpedizione;
    }
    
    public Email(String argomento, String text, String mittente, String destinatario){
        ID=ID+1;
        this.setArgument(argomento);
        this.setText(text);
        this.setMittente(mittente);
        this.setDestinatario(destinatario);   
    }
}
