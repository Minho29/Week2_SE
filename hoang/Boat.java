package Tut1.Exersice3.hoang;

public class Boat extends Vehicle {
    private String location;

    public Boat(String name, double width,double length, double height, double weight, int seatingCapacity, String registrationNumber, String location){
        super(name, width, length, height, weight, seatingCapacity, registrationNumber);
        this.location = location;

    }

    public void location() {
        System.out.println("Can use this here "+ this.location);
    }
}
