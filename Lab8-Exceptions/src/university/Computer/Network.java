package university.Computer;

/**
 *
 * @author Polis
 */
public class Network {
    
    private String description;
    
    public Network() {
        System.out.println("This is a Data Network.");
    }
    
    public Network(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "This network carries bit & bytes.";
    }
}
