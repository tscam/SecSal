package secsalloginv1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class CrearPacienteController
  implements Initializable
{
  @FXML
  private AnchorPane root;
  @FXML
  private JFXButton btnAceptar;
  @FXML
  private JFXButton btnSalir;
  @FXML
  private JFXTextField txtRut;
  @FXML
  private JFXTextField txtPNombre;
  @FXML
  private JFXTextField txtPApellido;
  @FXML
  private JFXTextField txtSNombre;
  @FXML
  private JFXTextField txtSApellido;
  @FXML
  private JFXDatePicker daFechaNacimiento;
  @FXML
  private Text rutError;
  @FXML
  private Text erroPnombre;
  @FXML
  private Text errorPapellido;
  @FXML
  private Text errorSNombre;
  @FXML
  private Text errorSApellido;
  
  public CrearPacienteController() {}
  
  public void initialize(URL url, ResourceBundle rb) {}
  
  @FXML
  private void crearPaciente(ActionEvent event)
  {
    String rut = txtRut.getText();
    String pNombre = txtPNombre.getText().trim();
    String sNombre = txtSNombre.getText().trim();
    String pApellido = txtPApellido.getText().trim();
    String sApellido = txtSApellido.getText().trim();
    
    if (rut.equals(""))
    {
      rutError.setText("Ingrese rut!");


    }
    else if (pNombre.equals(""))
    {
      rutError.setText("");
      erroPnombre.setText("Ingrese Nombre");


    }
    else if (sNombre.equals(""))
    {
      erroPnombre.setText("");
      errorSNombre.setText("Ingrese Segundo Nombre");


    }
    else if (pApellido.equals(""))
    {
      errorSNombre.setText("");
      errorPapellido.setText("Ingrese Primer Apellido");
    }
    else
    {
        if(sApellido.equals(""))
        {
            errorPapellido.setText("");
            errorSApellido.setText("Ingrese Segundo Apellido");
        }
        else
        {
        }
    }
  }
  

  @FXML
  private void salir(ActionEvent event)
  {
    try
    {
      Stage login = (Stage)btnSalir.getScene().getWindow();
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menuPrimario.fxml"));
      Parent root1 = (Parent)fxmlLoader.load();
      Stage stage = new Stage();
      stage.setTitle("Menú Principal SecSal Inc.");
      stage.setScene(new Scene(root1));
      stage.show();
    } catch (IOException ex) {
      Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
  
  @FXML
  private void fechaNacimiento(ActionEvent event) {}
}
