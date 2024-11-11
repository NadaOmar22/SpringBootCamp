package Practice;

public class Circle implements Shape{

    int radius;

    public Circle(){
        this.radius = 0;
    }

    @Override
    public double getArea(){
        return 3.14 * this.radius * this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
