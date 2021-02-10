package vehicle;

import java.util.Scanner;

/**
 *
 * @author Polis
 */
public class TestVehicle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        String owner;
        String licensePlate;
        int cc;
        int hp;
        
        Vehicle arr[] = new Vehicle[3];
        for (int i=0; i<arr.length; i++) {
            System.out.println();
            arr[i] = new Vehicle();
            
            System.out.print("Owner's name: ");
            arr[i].setOwner(sc1.nextLine());
            
            System.out.print("Car license plate (String): ");
            arr[i].setLicensePlate(sc1.nextLine());
            
            System.out.print("Car build year: ");
            int year = sc.nextInt();
            
            SystimaDieythynsis sd = new SystimaDieythynsis();
            System.out.print("Engine displacement (cc): ");
            cc = sc.nextInt();
            
            System.out.print("Car's horsepower: ");
            hp = sc.nextInt();
            
            Engine eng = new Engine(cc, hp);
            arr[i] = new Vehicle(arr[i].getOwner(), arr[i].getLicensePlate(), year, sd, eng);
            
            System.out.println("\n"+arr[i].toString());
            
            arr[i].vazeiEmpros();
            arr[i].striveiAristera();
            arr[i].svinei();
        }
    }
    
}
