package FlyWeight;

public class Rectangle implements Shape {
    private String color; // Propriedade intrínseca

    public Rectangle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Desenhando um retângulo de cor " + color);
    }
}
