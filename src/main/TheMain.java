package main;

import javafx.application.Application;
import javafx.stage.Stage;
import viewcontroller.CalculatedBindingC;

/**
 * @author David Wandratsch
 * @version 1.0, 25.11.2021, class TheMain
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
        CalculatedBindingC.show(primaryStage);
    }
}