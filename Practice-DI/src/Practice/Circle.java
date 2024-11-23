package Practice;

public class Circle implements Shape{

    int radius;

    Draw2d draw2d;

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

    public Draw2d getDraw2d() {
        return draw2d;
    }

    public void setDraw2d(Draw2d draw2d) {
        this.draw2d = draw2d;
    }
}
