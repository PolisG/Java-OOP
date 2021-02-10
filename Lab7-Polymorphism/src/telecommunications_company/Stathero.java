package telecommunications_company;

/**
 *
 * @author Polis
 */
class Stathero extends Telephone {
    
    Stathero() {
        super();
        String number_kin ="2";
        for(int i=0; i<9; i++) {
            int a = (int)(Math.random() * 9);
            number_kin = number_kin+a;
        }
        setNumber(number_kin);
    }
    Stathero(String owner, String number) {
        super(owner,number);
    }
    
    @Override
    public String toString() {
        String s ="Idioktitis: " + getOwner() + " Arithmos tilefonou: " + getNumber();
        return s;
    }
    
    @Override
    public void dial(String numbertocall) { //methodos pou emfanizei to katallilo minima kai dinei tin timi tis diarkeias tis klisis
        if(numbertocall.charAt(0)=='2') {
            System.out.println("Klisi apo stathero tilefono " + getNumber() + " pros to stathero me arithmo " + numbertocall);
            int ar_sec = (int)(Math.random() * 1000);
            setSecondsProsStath(getSecondsProsStath() + ar_sec);
        }
        
        if(numbertocall.charAt(0)=='6') {
            System.out.println("Klisi apo stathero tilefono " + getNumber() + " pros to kinito me arithmo " + numbertocall);
            int ar_sec = (int)(Math.random() * 1000);
            setSecondsProsKin(getSecondsProsKin() + ar_sec);
        }
    }

    @Override
    public double cost(int c) { //methodos pou upologizei kai epistrefei to kostos twn klisewn
        double kostosanasecond = 0;
        
        if(c==1)    //an kaloume se stathero
            kostosanasecond = callCosts[0]*getSecondsProsStath();
        
        if(c==2)    //an kaloume se kinito
            kostosanasecond = callCosts[1]*getSecondsProsKin();
        
        return kostosanasecond;
    }
    
}