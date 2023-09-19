class Vehicle{
    private int speed;

    public void start(){
        System.out.println("Vehicle started.");
    }

    public void speedUp(){
        speed += 10;
    }

    public int getSpeed(){
        return speed;
    }
}

class Car extends Vehicle{
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("Car speed increased..");
    }

    public void speed(){
        System.out.println("Current speed of car is "+super.getSpeed());
    }
}

class Bike extends Vehicle{
    @Override
    public void speedUp(){
        super.speedUp();
        System.out.println("Bike Speed increased..");
    }

    public void speed(){
        System.out.println("Current speed of Bike is "+super.getSpeed());
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.speed();
        c.speedUp();
        c.speedUp();
        c.speed();

        Bike b=new Bike();
        b.start();
        b.speedUp();
        b.speedUp();
        b.speedUp();
        b.speed();
    }
}
