package vehicle;

import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String owner = "";
	String license_plate = "";
	int build_year;
	int cc;
	int hp;
        
        System.out.print("Number of vehicles: ");
	int num = sc.nextInt();
	Vehicle arr[] = new Vehicle[num];

	int index = 0;
        
        while (index < arr.length) {
            int a,b;
            char ch;
            for(int i=0; i<5; i++) {
                a = (int)(Math.random()*26)+'a';        //Random letter between a and z
                ch = (char)a;
                if (i==0) ch = Character.toUpperCase(ch);
                owner+=ch;                              //Prosthesi sto String meta apo metatropi se char

                b = (int)(Math.random()*26)+'a';        //Random letter between a and z
                ch = (char)b;
                ch = Character.toUpperCase(ch);
                license_plate+=ch;                      //Prosthesi sto String meta apo metatropi se char
            }
            owner+=" Nikos";
            license_plate+=" 2324";
            build_year = (int)(Math.random()*37)+1980;  //Number between 1980-2016
            cc = (int)(Math.random()*2001)+7000;        //Number between 7000-9000
            hp = (int)(Math.random()*501)+100;          //Number between 100-600
            int doors = (int)(Math.random()*4)+2;       //Number between 2-5
            int axles = (int)(Math.random()*5)+4;       //Number between 4-8
            
            Engine eng = new Engine(cc, hp);

            int x = (int)(Math.random()*100);
            if (x>=0 && x<10)
                arr[index] = new Truck(owner, license_plate, build_year, eng, axles);   //10% percentage of vehicle being a truck
            else if (x>=10 && x<20)
                arr[index] = new Motorcycle(owner, license_plate, build_year, eng);     //10% percentage of vehicle being a motorcycle
            else
                arr[index] = new Car(owner, license_plate, build_year, eng, doors);     //80% percentage of vehicle being a car
            System.out.println("\n"+arr[index]);

            arr[index].transferOwnership("Polis");
            System.out.println(arr[index]);
            arr[index].Drive();

            owner = "";
            license_plate = "";
            index++;
        }
    }
    
}
