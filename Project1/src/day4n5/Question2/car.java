package Project1.src.day4n5.Question2;

public class car extends vehicle
{
    int speed;

    public car() { // constructor with no parameters
        speed = 45;
        milage = 60;
    }

    public car(int speed) { //constructor with parameters
        this.speed = speed; // using the parameters
    }

    public static void main(String[] args)
    {
        car c = new car();
        System.out.println("Speed of Day4n5.Question1.Question2.Car: "+ c.speed + " Milage of Day4n5.Question1.Question2.Car: "+c.milage);
        car c1 = new car(50);
        System.out.println("Speed of Day4n5.Question1.Question2.Car is: "+c1.speed);

    }
}
