package multiple_inheritance;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Polis
 */
public class PegasusTest {
    
    @org.junit.Test
    public void test() {
        Scanner sc = new Scanner(System.in);
        
        Animal[] Ranch = new Animal[4];
        Animal[] Aviary = new Animal[4];
	
        Random rnd = new Random();
	int age;
	float weight;
	float tempRnd;
	for (int i=0; i<4; i++) {
            do {
                age = rnd.nextInt(100);
            }while(age < 0);
            
            tempRnd = rnd.nextFloat();
            if (tempRnd < 0.5) {
                weight = rnd.nextFloat() * 300;
                Ranch[i] = new Horse(age, weight);
                Aviary[i] = new Bird(age, weight);
            }
            else {
                weight = rnd.nextFloat() * 700+300;
                Ranch[i] = new Pegasus(age, weight);
                Aviary[i] = new Pegasus(age, weight);
            }
        }
        for (int i=0; i<4; i++) {
            if (Ranch[i] instanceof Pegasus) {
                System.out.println("\nRanch[" + i + "]: Type: Pegasus\n" + Ranch[i]);
                ((Pegasus)Ranch[i]).fly();
                ((Pegasus)Ranch[i]).whinny();
                ((Pegasus)Ranch[i]).gallop();
            }
            else {
                System.out.println("\nRanch [" + i + "]: Type: Horse\n" + Ranch[i]);
                ((Horse)Ranch[i]).whinny();
                ((Horse)Ranch[i]).gallop();
            }
            if (Aviary[i] instanceof Pegasus) {
                System.out.println("\nAviary[" + i + "]: Type: Pegasus\n" + Aviary[i]);
                ((Pegasus)Aviary[i]).fly();
                ((Pegasus)Aviary[i]).whinny();
                ((Pegasus)Aviary[i]).gallop();
            }
            else {
                System.out.println("\nAviary[" + i + "]: Type: Bird\n" + Aviary[i]);
                ((Bird)Aviary[i]).fly();
                ((Bird)Aviary[i]).chirp();
            }
	}
    }
    
    
    public static void main (String args[]) {
        org.junit.runner.JUnitCore.main("multiple_inheritance.PegasusTest");
    }
}