package secsalloginv1;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
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
import javafx.stage.Stage;












public class PanelLateralController
  implements Initializable
{
  @FXML
  private JFXButton btnCrearPaciente;
  @FXML
  private JFXButton btnVerResultados;
  @FXML
  private JFXButton btnSolicitarExamen;
  @FXML
  private JFXButton btnSalir;
  
  public PanelLateralController() {}
  
  public void initialize(URL url, ResourceBundle rb) {}
  
  @FXML
  void creaPaciente(ActionEvent event)
  {
    try
    {
      Stage cPaciente = (Stage)btnCrearPaciente.getScene().getWindow();
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("crearPaciente.fxml"));
      Parent root1 = (Parent)fxmlLoader.load();
      Stage stage = new Stage();
      stage.setTitle("Crear Paciente SecSal Inc.");
      stage.setScene(new Scene(root1));
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  @FXML
  private void salir(ActionEvent event)
  {
    System.exit(0);
  }
}
