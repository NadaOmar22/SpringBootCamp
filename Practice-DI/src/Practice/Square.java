package Practice;

public class Square implements Shape{

    int length;

    Draw3d draw3d;

    public Square(Draw3d draw3d){
        this.draw3d = draw3d;
        this.length = 0;
    }

    @Override
    public double getArea(){
        return this.length * this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Draw3d getDraw3d() {
        return draw3d;
    }

    public void setDraw3d(Draw3d draw3d) {
        this.draw3d = draw3d;
    }
}
