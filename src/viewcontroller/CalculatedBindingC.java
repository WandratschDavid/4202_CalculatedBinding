package viewcontroller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Calculation;

import java.io.IOException;

/**
 * @author David Wandratsch
 * @version 1.0, 25.11.2021, class CalculatedBindingC
 * @link https://github.com/WandratschDavid/4202_calculatedBinding
 */
public class CalculatedBindingC
{
    @FXML
    private Label textLabel;

    @FXML
    private TextField textField;

    private final Calculation calculation = new Calculation();

    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(CalculatedBindingC.class.getResource("CalculatedBindingV.fxml"));
            Parent root = (Parent) loader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("4202_calculatedBinding");
            stage.show();
        }
        catch (IOException ex)
        {
            System.err.printf("Error using %s!", "CalculatedBindingV.fxml");
            ex.printStackTrace();
            System.exit(1);
        }
    }
}