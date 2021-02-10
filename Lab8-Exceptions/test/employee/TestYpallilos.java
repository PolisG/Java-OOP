package employee;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Polis
 */
public class TestYpallilos {
    public static void main(String args[]) throws InvalidBirthDateException, InvalidHoursException {
        
        Scanner sc = new Scanner(System.in);

	Employee emp = new Employee();
	
        System.out.print("Name: ");
	String name = sc.nextLine();
	String birth = checkBirthdate();
	System.out.print("Child number: ");
	int child = sc.nextInt();
	double bonusFactor = emp.ypologismosSyntelestiEpidomatos(child);
	System.out.print("Daily wage: ");
	double dayW = sc.nextDouble();
	double workingH[] = new double[12];
	double overtime[] = new double[12];
	double apodohes;
	
        Random rnd = new Random();
	for (int i=0; i<12; i++) {
            System.out.println("\n"+"Gia ton "+(i+1)+"o mhna");
            System.out.print("Working hours: ");
            workingH[i] = (double)(rnd.nextInt(14));
            System.out.println(workingH[i]);
            System.out.print("Overtime: ");
            overtime[i] = (double)(rnd.nextInt(10));
            System.out.println(overtime[i]);
            emp.setWorkingHours(workingH[i], i);
            emp.setOvertime(overtime[i], i);
            apodohes = emp.ypologismosApodohon(bonusFactor, i);
            emp.oresErgasias(i);
	}
        Wres(workingH);
        Yper(overtime);
        emp = new Employee(name, birth, dayW, child, bonusFactor);
        emp.toString();
    }
    
    public static void Wres(double workingH[]) {
        double synOres = 0;
        for (int i=0; i<12; i++) {
            if ((i<0)||(i>12))
                throw new ArrayIndexOutOfBoundsException();
            synOres = workingH[i]+synOres;
        }
        System.out.println("Oi synolikes wres ergasias einai "+synOres);
    }
    
    public static void Yper(double overtime[]) throws InvalidHoursException {
        double synYperor = 0;
        for (int i=0; i<12; i++)
            synYperor = overtime[i]+synYperor;
        try {
            if (synYperor>120)
                throw new InvalidHoursException();
        }
        catch (InvalidHoursException e) {
            System.out.println("Too many hours!");
        }
        if (synYperor < 0)
            throw new InvalidHoursException();
        System.out.println("Oi sunolikes uperories ergasias einai "+synYperor);
    }
    
    public static String checkBirthdate() throws InvalidBirthDateException {
        
        Scanner Sc = new Scanner(System.in);
        
        boolean b;
        String birth ="";
        System.out.print("Birth Date: ");
        
        do {
            try {
                b = false;
                birth = Sc.nextLine();
                if (birth.length()!=8) {
                    throw new InvalidBirthDateException();
                }
                for (int i=0; i<birth.length(); i++)
                    if(Character.isLetter(birth.charAt(i))) {
                        throw new InvalidBirthDateException();
                    }
                String d = birth.substring(0,2);
                int day = Integer.parseInt(d);
                if (day<1 || day>31) {
                    throw new InvalidBirthDateException();
                }
                
                String m = birth.substring(2,4);
                int month = Integer.parseInt(m);
                if (month<1 || month>12){
                    throw new InvalidBirthDateException();
                }
            }
            catch (InvalidBirthDateException e) {
                System.out.print("Dose nea hmerominia: ");
                b = true;
            }
        } while (b);
        return birth;
    }
    
}