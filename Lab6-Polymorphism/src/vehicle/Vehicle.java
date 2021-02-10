package vehicle;

/**
 *
 * @author Polis
 */
abstract public class Vehicle {
    
    private String owner;
    private String newOwner;
    private String licensePlate;
    private int buildYear;
    private Engine eng;
    
    Vehicle() {}

    public Vehicle(String owner, String licensePlate, int buildYear, Engine eng) {
        this.owner = owner;
        this.licensePlate = licensePlate;
        this.buildYear = buildYear;
        this.eng = eng;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public Engine getEng() {
        return eng;
    }
    
    abstract public void Drive();

    public String getNew_owner() {
        return newOwner;
    }

    public void setNew_owner(String newOwner) {
        this.newOwner = newOwner;
    }
    
    public void transferOwnership(String newOwner) {
        setOwner(newOwner);
        System.out.println("Ownership transferred to " + newOwner);
    }

    @Override
    public String toString() {
        return "Vehicle{" + "Owner= " + getOwner() + ", License Plate= " + getLicensePlate() + ", Build Year= " + getBuildYear() + ", eng=" + eng + '}';
    }
    
}