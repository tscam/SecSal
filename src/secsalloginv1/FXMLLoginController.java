package secsalloginv1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class FXMLLoginController
  implements Initializable
{
  @FXML
  private Label label;
  @FXML
  private JFXButton btnIniciar;
  @FXML
  private JFXButton btnSalir;
  @FXML
  private JFXTextField txtUsuario;
  @FXML
  private JFXPasswordField txtClave;
  
  public FXMLLoginController() {}
  
  @FXML
  void Iniciar(ActionEvent event)
  {
    String usuario = txtUsuario.getText();
    String clave = txtClave.getText();
    if ((usuario.equals("Admin")) && (clave.equals("123"))) {
      try
      {
        Stage login = (Stage)btnIniciar.getScene().getWindow();
        login.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuPrimario.fxml"));
        Parent root1 = (Parent)fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("Incio de Sesión");
        stage.setScene(new Scene(root1));
        stage.show();
      } catch (IOException ex) {
        Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }
    else {
      System.out.println("Uusario o contraseña Incorrecto");
    }
  }
  
  public void initialize(URL url, ResourceBundle rb) {}
}
