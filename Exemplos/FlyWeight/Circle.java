package FlyWeight;

public class Circle implements Shape {
    private String color; // Propriedade intrínseca

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um círculo de cor " + color);
    }
}
