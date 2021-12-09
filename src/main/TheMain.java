package main;

import javafx.application.Application;
import javafx.stage.Stage;
import viewcontroller.CylinderC;

/**
 * @author David Wandratsch
 * @version 1.0, 02.12.2021, class TheMain
 * @link https://github.com/WandratschDavid/4202_calculatedBinding
 */
public class TheMain extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        CylinderC.show(primaryStage);
    }
}