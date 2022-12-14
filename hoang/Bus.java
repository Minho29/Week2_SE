package Tut1.Exersice3.hoang;

public class Bus extends Vehicle {

    public Bus(String name, double width,double length, double height, double weight , int seatingCapacity, String registrationNumber){
        super(name, width, length, height, weight , seatingCapacity, registrationNumber);

    }

    @Override
    public boolean validateLength(double length) {
        if (length >= 4.0 && length <= 10){
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean validateWeight(double weight) {
        if (weight >= 5000.0 && weight <= 20000.0){
            return true;
        } else {
            return false;
        }

    }


    @Override
    public boolean validateRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() > 0 && registrationNumber.length() <= 8){
            return true;
        }else {
            return false;
        }
    }
}
