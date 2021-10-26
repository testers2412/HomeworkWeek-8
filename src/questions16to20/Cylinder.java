package questions16to20;

public class Cylinder extends Circle {
    double height;
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
        if(height<0){
            this.height=0;
        }
    }
    public double getHeight(){
        return  height;
    }
    public  double getVolume(){
        double volume = height*super.getArea();
        return volume;
    }

}
