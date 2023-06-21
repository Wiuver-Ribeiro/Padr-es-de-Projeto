package FlyWeight;

public class Main {
    public static void main(String[] args) {
    
        Shape redCircle = ShapeFactory.getShape("red");
        Shape greenCircle = ShapeFactory.getShape("green");
        Shape blueCircle = ShapeFactory.getShape("blue");
        Shape yellowRectangle = ShapeFactory.getShape("yellow");
        Shape orangeRectangle = ShapeFactory.getShape("orange");

    
        redCircle.draw();
        greenCircle.draw();
        blueCircle.draw();
        yellowRectangle.draw();
        orangeRectangle.draw();
    }
}
