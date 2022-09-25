package Tut1.Exersice3.hoang;

public class Motorbike extends Vehicle{
    private int cubicCapacity;

    public Motorbike(String name, double width,double length, double height, double weight, int seatingCapacity, String registrationNumber, int cubicCapacity){
        super(name, width, length, height, weight,seatingCapacity, registrationNumber);
        this.cubicCapacity = cubicCapacity;
    }

}
