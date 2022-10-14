package shapes;

abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;
    public Quadrilateral(){
        this.length = 1;
        this.width = 1;
    }
    public Quadrilateral(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        return this.length;
    }
    public double getWidth(){
        return this.width;
    }
    protected abstract void setLength(double length);
    protected abstract void setWidth(double width);
}
