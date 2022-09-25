package Tut1.Exersice3.hoang;

import java.util.Scanner;

public class IronSuit extends Vehicle {
    

    public IronSuit(String name, double width, double length, double height, double weight, int seatingCapacity, String registrationNumber) {
        super(name, width, length, height, weight, seatingCapacity, registrationNumber);
        
    }

    public void fly() {
        String Apoint;
        String Bpoint;
        int dis;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter point A");
        Apoint = sc.nextLine();
        System.out.println("Enter point B");
        Bpoint = sc.nextLine();

        System.out.println("Enter distance: ");
        dis = sc.nextInt();

        String print = Apoint + " ";
        System.out.println();
        System.out.print(Apoint + " ");
        for (int i = 0; i <= dis; i++){
            int millies = 300;
            try {
                System.out.print(".");

                Thread.sleep(300);
//                print += ".";

            } catch (InterruptedException e){

            }
        }
        System.out.print(" " + Bpoint);
    }
}
