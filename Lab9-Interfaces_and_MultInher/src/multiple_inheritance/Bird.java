package multiple_inheritance;

/**
 *
 * @author Polis
 */
class Bird extends Animal implements iBird {
    
    Bird() {}
    
    Bird(int age, double weight) {
        super(age,weight);
    }
    
    public void chirp() {
        System.out.println("chirp...");
    }
    
    @Override
    public void fly() {
        System.out.println("fly high");
    }
    
}