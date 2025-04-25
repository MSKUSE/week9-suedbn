public abstract class Shape {

    private String color="White";
    public Shape() {

    }
    public Shape(String color) {
        this.color = color;
    }

    public abstract double perimeter();
    public abstract double area();

    public String toString() {
        return "Shape{" +
                "color='" + color + '/' +
                '}';
    }

}
