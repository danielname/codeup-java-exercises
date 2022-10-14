package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    void setLength() {

    }

    @Override
    void setWidth() {

    }
//    protected int length;
//    protected int width;
//    public Rectangle(int length, int width){
//        this.length = length;
//        this.width = width;
//    }
//    public Rectangle(){
//        this.length = 1;
//        this.width = 1;
//    }
//    public int getArea(){
//        return this.length * this.width;
//    }
//    public int getPerimeter(){
//        return this.length * 2 + this.width * 2;
//    }
}
