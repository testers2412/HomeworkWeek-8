package questions16to20;

public class Rectangle {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        if (length < 0 && width < 0) {
            this.length = 0;
            this.width = 0;
        }

    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return  length;
    }
    public double getArea(){
        double area = width*length;
        return area;
    }



}
