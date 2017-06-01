package secsalloginv1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;








public class SecSalLoginv1
  extends Application
{
  public static Boolean isSplashLoaded = Boolean.valueOf(false);
  
  public SecSalLoginv1() {}
  
  public void start(Stage stage) throws Exception { Parent root = (Parent)FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    
    Scene scene = new Scene(root);
    
    stage.setScene(scene);
    stage.setTitle("Incio de sesión");
    stage.show();
  }
  


  public static void main(String[] args)
  {
    launch(args);
  }
}
