
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
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Bey
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    Label lblMessage = new Label();
    @FXML
    Button loginBTN = new Button("Login");
    @FXML
    TextField txtUserName = new TextField();
    @FXML
    PasswordField pwfield = new PasswordField();
    @FXML
    Hyperlink help;
    String username = "Money";
    String checkUser;
    String checkPw;
    Stage stage;
    Scene scene;
    Parent root;


    @FXML
    public void btnLogin(ActionEvent event) throws IOException {
        
        loginBTN.setOnAction(actionEvent -> {

            checkUser = txtUserName.getText();
            checkPw = pwfield.getText();
            String pw = "Money";
            if (checkUser.equals(username) && checkPw.equals(pw)) {
                lblMessage.setText("Congratulations!");
                lblMessage.setTextFill(Color.GREEN);
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
            } else {
                lblMessage.setText("Incorrect user or password.");
                lblMessage.setTextFill(Color.RED);
            }
            txtUserName.setText("");
        });

    }
    
      @FXML
    void help(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
