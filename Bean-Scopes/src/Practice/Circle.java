package Practice;

public class Circle implements Shape {
    Draw2d draw2d;

    public Circle(Draw2d draw2d){
        this.draw2d = draw2d;
    }

    @Override
    public void draw(String shapeName) {
        draw2d.draw(shapeName);
    }
}
