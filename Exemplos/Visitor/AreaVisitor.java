public class AreaVisitor implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Área do círculo: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Área do retângulo: " + area);
    }

    @Override
    public void visit(Triangle triangle) {
        double area = (triangle.getBase() * triangle.getHeight()) / 2;
        System.out.println("Área do triângulo: " + area);
    }
}
