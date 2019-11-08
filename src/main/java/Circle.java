public class Circle {

    private double radius = 1.0;
    private String color = "red";

    public Circle(){

    }

    public Circle(double radius){
        this.radius=radius;
    }

    public Circle(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return String.format("Circle RAIO: %.2f COR: %s AREA: %.2f", radius, color, getArea() );
    }

    public double getArea(){
        double area;
        area= (Math.PI)*radius*radius;
        return area;
    }

}
