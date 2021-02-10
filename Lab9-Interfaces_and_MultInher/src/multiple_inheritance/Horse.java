package multiple_inheritance;

/**
 *
 * @author Polis
 */
class Horse extends Animal implements iHorse {
    
    Horse() {}
    
    Horse(int age, double weight) {
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
    
}