package day6.areacalculator;

public class Rectangle extends Shape {
    double l,w;
    public Rectangle(double l, double w) {
        this.l = l;
        this.w=w;
    }
    @Override
    double calculateArea() {
        return l * w;
    }
}
