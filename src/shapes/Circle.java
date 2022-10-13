package shapes;

public class Circle {
        private static double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        public double getArea(){
            return Math.PI * Circle.radius * Circle.radius;
        }
        public double getCircumference(){
            return Math.PI * Circle.radius * 2;
        }
}
