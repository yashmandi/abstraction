public class ShapeCall {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());

        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("\nArea of triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of triangle: " + triangle.calculatePerimeter());
    }
}
