package cryptoCapstone;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Bey
 */
public class BitcoinFXMLController implements Initializable {

    Stage stage;
    Scene scene;
    Parent root;
    @FXML
    private Button dashboardBtn;
    @FXML
    Button exitBtn;
    @FXML
    private WebView webView;
    WebEngine engine;
    MediaView mediaView;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        engine = webView.getEngine();
        engine.load("https://www.youtube.com/watch?v=VrRBq3niQM0");

    }

    @FXML
    void returntodashboard(ActionEvent event) throws IOException {

        dashboardBtn.setOnAction(actionEvent -> {
            try {
                root = FXMLLoader.load(getClass().getResource("DashboardFXML.fxml"));
            } catch (IOException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Login");
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        });
    }

    @FXML
    void ExitApp(ActionEvent event) {

        exitBtn.setOnAction(actionEvent -> {
            System.exit(0);

        });

    }

}
