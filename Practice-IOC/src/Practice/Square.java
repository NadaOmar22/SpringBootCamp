package Practice;

public class Square implements Shape{

    int length;

    public Square(){
        this.length = 0;
    }

    @Override
    public double getArea(){
        return this.length * this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
