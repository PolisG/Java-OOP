package vehicle;

/**
 *
 * @author Polis
 */
public class Truck extends Vehicle {
    
    private int axles;
    
    public Truck() {}

    public Truck(int axles) {
        this.axles = axles;
    }

    public Truck(String owner, String licensePlate, int buildYear, Engine eng, int axles) {
        super(owner, licensePlate, buildYear, eng);
        this.axles = axles;
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        this.axles = axles;
    }
    
    @Override
    public void Drive() {
        System.out.println("You must be a professional driver. This is a " + getAxles() + "-axle truck mr/mrs. " + super.getOwner());
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s+=("Axles: " + getAxles());
	return s;
    }
    
}