package vehicle;

/**
 *
 * @author Polis
 */
public class Car extends Vehicle {
    
    private int doors;
    
    public Car() {}

    public Car(int doors) {
        this.doors = doors;
    }

    public Car(String owner, String licensePlate, int buildYear, Engine eng, int doors) {
        super(owner, licensePlate, buildYear, eng);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }
    
    @Override
    public void Drive() {
        System.out.println("You need a car driving license dear " + super.getOwner());
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s+=("Doors: " + getDoors());
        return s;
    }
    
}