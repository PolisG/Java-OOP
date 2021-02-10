package telecommunications_company;

import java.util.Scanner;

class TelephoneTest {
    
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = 0;
        if(args.length==0) {    // plithos thl. kai apo thn grammi entolwn
            System.out.print("Dose plithos tilefonwn: ");
            n = sc.nextInt();
        }else
            n = sc.nextInt();
        
        Telephone[] arr = new Telephone[n];
        for(int i=0; i<arr.length; i++) { //70% - Stathero, 30% - Kinito
            int y = (int)(Math.random() * 100 + 1);
            
            if(y<=70)
                arr[i] = new Stathero();
            if(y>70)
                arr[i] = new Kinito();
        }
        
        int x = (int)(Math.random() * 1 + 10); //tuxaios arithmos apo 1000-10000 gia tis diafores kliseis
        for(int i=0; i<x; i++) {
            int a = (int)(Math.random() * n);
            //tuxaios arithmos apo 1-100 (an o arithmos einai mikroteros apo 50-kinito, alliws stathero)
            int p = (int)(Math.random() * 100 + 1);
            String arithmos_tilefonou="";
            if(p<=50)
                arithmos_tilefonou="2";
            if(p>50)
                arithmos_tilefonou="6";
            
            for(int j=0; j<9; j++) {
                int b = (int)(Math.random() * 9);
                arithmos_tilefonou = arithmos_tilefonou+b;
            }
            
            arr[a].dial(arithmos_tilefonou);
        }
        
        for(int i=0; i<arr.length; i++) {
            //Emfanisi tou arithmo tilefonou kai to sunoliko kostos twn klisewn olwn twn tilefonwn
            System.out.println("\n"+"ar.thl=" + arr[i].getNumber() + " Kostos " + (arr[i].cost(1)+arr[i].cost(2)));
        }
        
        int sum = 0;
        for(Telephone arr1 : arr) {
            //ston pinaka, an periexei kinito/a emfanizoume to sunolo twn deuteroleptwn pou exoun kanei kliseis(ta kinita)
            if (arr1 instanceof Kinito)
                sum += arr1.getSecondsProsKin() + arr1.getSecondsProsStath();
        }
        
        System.out.println("\n"+"Syn. diarkeia klisewn apo kinita: " + sum);
        
        sum = 0;
        for(Telephone arr1 : arr) {
            //ston pinaka, an periexei stathero/a emfanizoume to sunolo twn deuteroleptwn pou exoun kanei kliseis(ta stathera)
            if (arr1 instanceof Stathero)
                sum += arr1.getSecondsProsKin() + arr1.getSecondsProsStath();
        }
        System.out.println("\n"+"Syn. diarkeia klisewn apo stathera: " + sum);
        
        double sum1 = 0;
        double sum2 = 0;
        for(Telephone arr1 : arr) {
            sum1 = sum1 + arr1.cost(1);
            sum2 = sum2 + arr1.cost(2);
        }
        //emfanizoume to sunoliko kostos pros stathera, kinita kaisunolika eksoda tis epixeiriseis apo oles tis kliseis
        System.out.println("\n"+"Exoda_Stathera="+ sum1 + " Exoda_Kinita=" + sum2 + " Exoda_Etairias="+(sum1+sum2));
    }
    
}