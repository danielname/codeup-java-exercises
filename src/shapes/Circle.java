package shapes;

public class Circle {
    public Circle (){
        private double radius;
        public Circle(double radius){
            Circle.radius = radius;
        }
        public double getArea(){
            return Math.PI * Circle.radius * Circle.radius;
        }
        public double getCircumference(){
            return Math.PI * Circle.radius * 2;
        }
    }
}
