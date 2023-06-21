import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.5));
        shapes.add(new Rectangle(4.0, 5.0));
        shapes.add(new Triangle(6.0, 8.0));

        AreaVisitor areaVisitor = new AreaVisitor();
        for (Shape shape : shapes) {
            shape.accept(areaVisitor);
        }
    }
}
