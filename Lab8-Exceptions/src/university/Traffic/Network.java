package university.Traffic;

/**
 *
 * @author Polis
 */
public class Network {
    
    private String description;
    
    public Network() {
        System.out.println("This is a Traffic Network.");
    }
    
    public Network(String description) {
        this.description = description;
    }
	
    @Override
    public String toString(){
        return "This network is used by vehicles.";
    }
    
}