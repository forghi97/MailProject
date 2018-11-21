/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mailproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author matteo
 */
public class MailProject extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        BorderPane root = loader.load();
        
        FXMLLoader listLoader = new FXMLLoader(getClass().getResource("MailList.fxml"));
        root.setLeft(listLoader.load());
        
        FXMLLoader emailViewerLoader = new FXMLLoader(getClass().getResource("EmailViewer.fxml"));
        root.setCenter(emailViewerLoader.load());
        
        FXMLLoader menuWindow= new FXMLLoader(getClass().getResource("MenuWindow.fxml"));
        root.setTop(menuWindow.load());
        
        DataModel model = new DataModel();
        model.loadData();
        
        FXMLDocumentController controller = loader.getController();
        MailListController listController = listLoader.getController();
        EmailViewerController emailViewerController = emailViewerLoader.getController();
        
        controller.initModel(model);
        listController.initModel(model);
        emailViewerController.initModel(model);
        
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.show();
        
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
