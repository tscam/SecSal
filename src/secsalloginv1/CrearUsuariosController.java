/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secsalloginv1;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.StringConverter;

/**
 * FXML Controller class
 *
 * @author xp
 */
public class CrearUsuariosController implements Initializable {

    
    @FXML
    private JFXComboBox<Label> cbx;
    
    
    @FXML
    private JFXButton salir;
    
    @FXML
    void crearUsuario(ActionEvent event) {
        cbx.getItems().add(new Label("Administrador"));
        cbx.getItems().add(new Label("Enfermera"));
        cbx.getItems().add(new Label("Médico"));
        cbx.setEditable(true);
        cbx.setPromptText("Select Java Version");
        cbx.setConverter(new StringConverter<Label>() {
            @Override
            public String toString(Label object) {
                return object==null? "" : object.getText();
            }

            @Override
            public Label fromString(String string) {
                return new Label(string);
            }
        });
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
    @FXML
    void volver(ActionEvent event) {
        Stage volver = (Stage)salir.getScene().getWindow();
        volver.close();
    }
    
}
