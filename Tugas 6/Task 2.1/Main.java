public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape.toString());

        Circle circle = new Circle(5.0, "blue", true);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(3.0, 4.0, "yellow", true);
        System.out.println(rectangle.toString());

        Square square = new Square(2.5);
        System.out.println(square.toString());
    }
}
