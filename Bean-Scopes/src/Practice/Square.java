package Practice;

public class Square implements Shape{

    Draw3d draw3d;

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }

    @Override
    public void draw(String shapeName) {
        draw3d.draw(shapeName);
    }
}
