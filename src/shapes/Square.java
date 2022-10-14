package shapes;

public class Square extends Rectangle{

    private int side;
    public Square(int sideLength){
        super(sideLength,sideLength);
        this.side = sideLength;
    }
    public int getArea(){
        return this.side * this.side;
    }
    public int getPerimeter(){
        return this.side * 4;
    }
}
