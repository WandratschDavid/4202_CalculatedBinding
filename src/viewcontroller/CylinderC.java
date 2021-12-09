package viewcontroller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Cylinder;

import java.io.IOException;

/**
 * @author David Wandratsch
 * @version 1.0, 02.12.2021, class CylinderC
 * @link https://github.com/WandratschDavid/4202_calculatedBinding
 */
public class CylinderC
{
    @FXML
    private TextField txtHeight;

    @FXML
    private TextField txtRadius;

    @FXML
    private TextField txtVolume;

    @FXML
    private TextField txtSurface;

    @FXML
    private TextField txtScope;

    @FXML
    private Slider sliderHeight;

    @FXML
    private Slider sliderRadius;

    Cylinder cylinder = new Cylinder();

    @FXML
    private ImageView ivCylinder;

    public static void show(Stage stage)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader(CylinderC.class.getResource("CylinderV.fxml"));
            Parent root = (Parent) loader.load();

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("4202_calculatedBinding");
            stage.show();
        }
        catch (IOException ex)
        {
            System.err.printf("Error using %s!", "CylinderV.fxml");
            ex.printStackTrace();
            System.exit(1);
        }
    }

    @FXML
    void initialize()
    {
        cylinder.heightProperty().bind(sliderHeight.valueProperty());
        cylinder.radiusProperty().bind(sliderRadius.valueProperty());

        txtHeight.textProperty().bind(cylinder.heightProperty().asString("%.2f"));
        txtRadius.textProperty().bind(cylinder.radiusProperty().asString("%.2f"));

        txtVolume.textProperty().bind(cylinder.volumeProperty().asString("%.2f"));
        txtSurface.textProperty().bind(cylinder.surfaceProperty().asString("%.2f"));
        txtScope.textProperty().bind(cylinder.scopeProperty().asString("%.2f"));

        ivCylinder.setPreserveRatio(false);
        ivCylinder.fitHeightProperty().bind(sliderHeight.valueProperty());
        ivCylinder.fitWidthProperty().bind(sliderRadius.valueProperty());
    }
}