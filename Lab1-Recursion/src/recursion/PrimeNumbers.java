package recursion;

public class PrimeNumbers {
    public static void main(String[] args) {
        
        String primeNumbers = "";
        
        for (int i=1; i<=1000; i++) {
            int counter = 0;
            for (int num=i; num>=1; num--) {
                if(i%num==0)
                    counter += 1;
            }
            if (counter == 2)
                primeNumbers = primeNumbers + i + " ";
        }	
        System.out.println("Prime numbers from 1 to 1000 are :");
        System.out.println(primeNumbers);
    }
    
}
