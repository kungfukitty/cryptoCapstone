
package cryptoCapstone;

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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LogingPreFXMLController {

    @FXML
    private PasswordField password= new PasswordField();

    @FXML
    private TextField username = new TextField();

    @FXML
    private Button login  = new Button("Login");

    @FXML
    private Button dash = new Button();

    @FXML
    private Button exit= new Button();

    @FXML
    private Label lblMessage  = new Label();
    String userName = "Money";
    String pw = "Money";
    String checkUser;
    String checkPw;
    Stage stage;
    Scene scene;
    Parent root;


    @FXML
    void ExitApp(ActionEvent event) {
           System.exit(0);
    }

    @FXML
    void loginBtn(ActionEvent event) {
        

            checkUser = username.getText();
            checkPw = password.getText();
            
            if (checkUser.equals(userName) && checkPw.equals(pw)) {
                lblMessage.setText("Congratulations!");
                lblMessage.setTextFill(Color.GREEN);
                try {
                    root = FXMLLoader.load(getClass().getResource("PreDashFXML.fxml"));
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
            username.setText("");
      

    }

    @FXML
    void returnDash(ActionEvent event) {
        dash.setOnAction(actionEvent -> {
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

}

