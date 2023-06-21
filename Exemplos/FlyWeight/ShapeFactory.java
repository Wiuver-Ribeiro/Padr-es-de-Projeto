package FlyWeight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();

    public static Shape getShape(String color) {
        Shape shape = shapes.get(color);

        if (shape == null) {
            
            if (color.equalsIgnoreCase("red")) {
                shape = new Circle("red");
            } else if (color.equalsIgnoreCase("green")) {
                shape = new Circle("green");
            } else if (color.equalsIgnoreCase("blue")) {
                shape = new Circle("blue");
            } else if (color.equalsIgnoreCase("yellow")) {
                shape = new Rectangle("yellow");
            } else if (color.equalsIgnoreCase("orange")) {
                shape = new Rectangle("orange");
            }

          
            shapes.put(color, shape);
        }

        return shape;
    }
}
