package shapes;

public class Square extends Quadrilateral{
    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    protected void setLength(double squareLength) {
        length = squareLength;
    }

    @Override
    protected void setWidth(double squareWidth) {
        width = squareWidth;
    }

//    private int side;
//    public Square(int sideLength){
//        super(sideLength,sideLength);
//        this.side = sideLength;
//    }
//    public int getArea(){
//        return this.side * this.side;
//    }
//    public int getPerimeter(){
//        return this.side * 4;
//    }

}
