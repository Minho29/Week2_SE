package Tut1.Exersice3.hoang;

public class Vehicle {
    private String name;
    private double width;
    private double length;
    private double height;
    private double weight;
    private int seatingCapacity;
    private String registrationNumber;



    public Vehicle(String name, double width, double length, double height, double weight, int seatingCapacity, String registrationNumber) {
        this.name = name;
        this.width = width;
        if (validateLength(length)){
            this.length = length;
        }

        this.height = height;

        if (validateWeight(weight)){
            this.weight = weight;
        }
        this.seatingCapacity = seatingCapacity;
        if (validateRegistrationNumber(registrationNumber))
        this.registrationNumber = registrationNumber;
    }
    public boolean validateLength(double length){
        return true;
    }
    public boolean validateWeight(double weight){
        return true;
    }

    public boolean validateRegistrationNumber(String registrationNumber) {
        if (registrationNumber.length() > 0 && registrationNumber.length() <= 12){
            return true;
        }
            return false;
        }

    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "={" +
                "name='" + name + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                ", weight=" + weight +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public void travel(String a, String b, int passengers) {
        char c = '\u2191';
        char d = '\u2193';
        String space = "";
        if (this.getClass().getSimpleName().equals("Car")){
            space = c + " "+ this.getClass().getSimpleName() + ": " +
                    "travel from "+ a + " to " + b + " with " + passengers +" passengers";
            System.out.println(space);
        } else if (this.getClass().getSimpleName().equals("Bus")){
            space = d + " "+ this.getClass().getSimpleName() + ": " +
                    "travel from "+ a + " to " + b + " with " + passengers +" passengers";
            System.out.println(space);
        }


        
    }

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("BMW", 450.0, 2.0, 1.5, 1200.0, 1, "98C12345");
        System.out.println(vehicle);

        Vehicle car = new Car("Toyata", 480.0, 2.3, 2.2, 1500.0, 5, "98B12345");
        System.out.println(car);
        car.travel( "Bac Giang", "Ha Noi", 3);

        Vehicle bus = new Bus("Ford", 830.0, 4.0, 8.0, 10000.0, 30, "98B12345");
        System.out.println(bus);
        bus.travel( "Dong Da", "Thanh Xuan", 20);

        IronSuit iS = new IronSuit("Mark42", 1.0, 2.0, 1.8, 200.0, 1, "98B12345");
        iS.fly();

        System.out.println("Add a mess to github");

    }
}
