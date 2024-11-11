package Practice;

public class Rectangle implements Shape{

    int height;
    int width;

    public Rectangle(){
        this.height = 0;
        this.width = 0;
    }

    @Override
    public double getArea(){
        return this.width * this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
