package multiple_inheritance;

/**
 *
 * @author Polis
 */
class Pegasus extends Animal implements iBird, iHorse {
    
    Pegasus() {}
    
    Pegasus(int age, double weight) {
        super(age,weight);
    }
    
    @Override
    public void whinny() {
        System.out.println("whinny");
    }
    
    @Override
    public void gallop() {
        System.out.println("travel fast");
    }
    
    @Override
    public void fly() {
        System.out.println("fly high");
    }
    
}