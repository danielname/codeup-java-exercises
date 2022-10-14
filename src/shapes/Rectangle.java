package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return length * 2 + width * 2;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    protected void setLength(double length) {
        this.length = length;
    }

    @Override
    protected void setWidth(double width) {
        this.width = width;
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
