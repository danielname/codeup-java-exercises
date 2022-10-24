package shapes;

public class Square extends Quadrilateral{

    @Override
    protected void setLength(double length) {
        this.length = length;
    }

    @Override
    protected void setWidth(double width) {
        this.width = width;
    }

//    private int side;
    public Square(int sideLength){
        super(sideLength,sideLength);
//        this.length = sideLength;
//        this.width = sideLength;
    }
//    public int getArea(){
//        return this.side * this.side;
//    }
//    public int getPerimeter(){
//        return this.side * 4;
//    }

}
