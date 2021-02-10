package vehicle;

/**
 *
 * @author Polis
 */
public class Vehicle {
    private String owner;
    private String licensePlate;
    private int buildYear;
    private SystimaDieythynsis sysDief;
    private Engine eng;

    public Vehicle(String owner, String licensePlate, int buildYear, SystimaDieythynsis sysDief, Engine eng) {
        this.owner = owner;
        this.licensePlate = licensePlate;
        this.buildYear = buildYear;
        this.sysDief = sysDief;
        this.eng = eng;
    }
    
    Vehicle() {}

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public SystimaDieythynsis getSysDief() {
        return sysDief;
    }

    public void setSysDief(SystimaDieythynsis sysDief) {
        this.sysDief = sysDief;
    }

    public Engine getEng() {
        return eng;
    }

    public void setEng(Engine eng) {
        this.eng = eng;
    }
    
    public void vazeiEmpros() {
        sysDief.vazeiEmpros(eng);
    }
    
    public void svinei() {
        sysDief.svinei(eng);
    }
    
    public void striveiAristera() {
        sysDief.striveiAristera(eng);
    }
    
    public void striveiDeksia() {
        sysDief.striveiDeksia(eng);
    }
    
    @Override
    public String toString() {
        return String.format("Owner: %s\n" + "License Plate: %s\n" + "Car build year: %s\n", this.owner, this.licensePlate, this.buildYear);
    }
    
}
