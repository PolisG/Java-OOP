package vehicle;

/**
 *
 * @author Polis
 */
public class Motorcycle extends Vehicle {
    
    private int cc;
    private int hp;
    Engine eng;

    public Motorcycle() {
        this.eng = new Engine(cc,hp);
    }

    public Motorcycle(int cc, int hp) {
        this.eng = new Engine(cc,hp);
        this.cc = cc;
        this.hp = hp;
    }

    public Motorcycle(String owner, String licensePlate, int buildYear, Engine eng) {
        super(owner, licensePlate, buildYear, eng);
        this.eng = new Engine(cc,hp);
    }
    
    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    @Override
    public void Drive() {
        System.out.println("You can not drive a motorcycle with a car driving license dear " + super.getOwner());
    }
    
}