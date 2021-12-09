package model;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * @author David Wandratsch
 * @version 1.0, 02.12.2021, class Cylinder
 * @link https://github.com/WandratschDavid/4202_calculatedBinding
 */

public class Cylinder
{
    private final DoubleProperty radius = new SimpleDoubleProperty();
    private final DoubleProperty height = new SimpleDoubleProperty();

    private NumberBinding volume;
    private NumberBinding scope;
    private NumberBinding surface;

    public Cylinder()
    {
        // Calculation of the volume (Volumen)
        this.volume = height.multiply(radius.multiply(radius.multiply(Math.PI)));

        // Calculation of the scope (Umfang)
        this.scope = radius.multiply(2 * Math.PI);

        // Calculation of the surface (Oberfläche)
        this.surface = scope.multiply(radius.add(height));
    }

    public DoubleProperty radiusProperty() {
        return radius;
    }

    public DoubleProperty heightProperty() {
        return height;
    }

    public NumberBinding volumeProperty() {
        return volume;
    }

    public NumberBinding scopeProperty() {
        return scope;
    }

    public NumberBinding surfaceProperty() {
        return surface;
    }
}