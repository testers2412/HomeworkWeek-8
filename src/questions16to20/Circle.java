package questions16to20;

public class Circle {
    double radius;
    public Circle(double radius){
        this.radius=radius;
        if(radius<=0){
            this.radius=0;
        }
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area= (radius*radius*Math.PI);
        return area;
    }
}
