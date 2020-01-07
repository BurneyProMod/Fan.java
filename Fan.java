package prog1_npb9925;

public class Fan {

    private double radius;
    private String speed;
    private String lights;
    private int arraySize;
    
    public Fan() {
        radius = 5;
        speed = "off";
        lights = "off";
    }

    public Fan(double initRadius) {
        if (initRadius >= 5 && initRadius <= 10) {
            radius = initRadius;
        }
    }

    public void SetRadius(double initRadius) {
        if (initRadius >= 5 && initRadius <= 10) {
            radius = initRadius;
        }
    }

    public double GetRadius(){
        return radius;
    }
    public void SetSpeed() {
        if (speed == "off") {
            speed = "low";
        } else if (speed == "low") {
            speed = "medium";
        } else if (speed == "medium") {
            speed = "high";
        } else {
            speed = "off";
        }
    }

    public String GetSpeed() {
        return speed;
    }

    public void SetLights() {
        if (lights == "off") {
            lights = "on";
        } else {
            lights = "off";
        }
    }

    public String GetLights() {
        return lights;
    }

    public String toString() {
            return "Radius: " +this.radius+" "+"Speed: "+speed+" "+"Lights: "+lights; 
    }
    
    public void SetArraySize(int initSize){
        this.arraySize = initSize;
    }
    
}
