package cryptoCapstone;

/**
 *
 * @author Bey
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

public class Dashboard {

    @FXML
    private Button pre;
    @FXML
    private Button exit;
    @FXML
    private Hyperlink privaLink;
    @FXML
    private Button btc;
    @FXML
    private Button vocabul;
    @FXML
    private Button hist;

    Stage stage;
    Scene scene;
    Parent root;

    @FXML
    void btcBtn(ActionEvent event) {
        btc.setOnAction(actionEvent -> {
            try {
                root = FXMLLoader.load(getClass().getResource("BitcoinFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Dashboard");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });
    }

    @FXML
    void vocabularyBtn(ActionEvent event) {

        vocabul.setOnAction(actionEvent -> {
            try {
                root = FXMLLoader.load(getClass().getResource("vocabFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Dashboard");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });

    }

    @FXML
    void histBtn(ActionEvent event) {

        hist.setOnAction(actionEvent -> {
            try {
                root = FXMLLoader.load(getClass().getResource("HistoryFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Dashboard");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });

    }

    @FXML
    void DisplayPre(ActionEvent event) {

        pre.setOnAction(actionEvent -> {
            try {
                root = FXMLLoader.load(getClass().getResource("LogingPreFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Dashboard");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });

    }


    @FXML
    void privacy(ActionEvent event) {
         privaLink.setOnAction(actionEvent -> {
            try {
                root = FXMLLoader.load(getClass().getResource("PrivacyFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Dashboard");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        });

    }
    
      @FXML
    void exitApp(ActionEvent event) {
        System.exit(0);
    }

}
