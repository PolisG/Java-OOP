package employee;

import java.util.Scanner;

/**
 *
 * @author Polis
 */
public class TestYpallilos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Employee emp[] = new Employee[6];
        
        for (Employee emp1 : emp) {
            System.out.print("Dwse typo ypallilou (Oromisthios (1,2) , Misthotos (3,4) , Proistamenos (5,6)): ");
            int y = sc.nextInt();
            System.out.println();
            
            switch(y) {
                case 1:
                    Oromisthios oro = new Oromisthios(4663,"Kostas Zacharakis "," Pliroforiki "," Mpotsari ",38);
                    
                    System.out.println(oro);
                    
                    double co = oro.calculatemoney_Orom();
                    
                    System.out.println("\n"+"O telikos misthos einai : "+co);
                    
                    break;
                
                case 2:
                    Oromisthios oro1 = new Oromisthios(1001,"Paulos Paulou "," Pliroforiki "," Kleanthous ",42);
                    
                    System.out.println(oro1);
                    
                    double co1 = oro1.calculatemoney_Orom();
                    
                    System.out.println("\n"+"O telikos misthos einai : "+co1);
                    
                    break;
                
                case 3:
                    Misthotos misth = new Misthotos(4660,"Niki Evaggelidou "," Simvoulos Tmimatos "," Peraia ",3,12);
                    
                    System.out.println(misth);
                    
                    double cm = misth.calculatemoney_Misth();
                    
                    System.out.println("\n"+"O Telikos misthos einai : "+cm);
                    
                    break;
                    
                case 4:
                    Misthotos misth1 = new Misthotos(2511,"Nikas Nikos "," Simvoulos Tmimatos "," Rotonta ",1,16);
                    
                    System.out.println(misth1);
                    
                    double cm1 = misth1.calculatemoney_Misth();
                    
                    System.out.println("\n"+"O Telikos misthos einai : "+cm1);
                    
                    break;
                    
                case 5:
                    Proistamenos prois = new Proistamenos(809,"Sofoklis Emmanouilidis "," Proedros Tmimatos "," Thermi ",2,30);
                    
                    System.out.println(prois);
                    
                    double cp = prois.calculatemoney_Prois();
                    
                    System.out.println("\n"+"O Telikos misthos einai : "+cp);
                    
                    break;
                    
                case 6:
                    Proistamenos prois1 = new Proistamenos(0304,"Dimitra Pappa "," Proedros Tmimatos "," Kalamaria ",1,31);
                    
                    System.out.println(prois1);
                    
                    double cp1 = prois1.calculatemoney_Prois();
                    
                    System.out.println("\n"+"O Telikos misthos einai : "+cp1);
                    
                    break;
            }
        }
    }
}