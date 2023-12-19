package constructor;

public class circle {
    private double radius;

    // Default constructor
    public circle() {
        this.radius = 0.0;
    }

    // Constructor with custom parameters
    public circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculate area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Using default constructor
        circle circle1 = new circle();
        circle1.setRadius(3.0);

        System.out.println("Area of Circle 1: " + circle1.calculateArea());

        // Using custom constructor
        circle circle2 = new circle(4.0);

        System.out.println("\nArea of Circle 2: " + circle2.calculateArea());
    }
}

