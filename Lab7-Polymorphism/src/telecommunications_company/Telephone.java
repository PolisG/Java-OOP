package telecommunications_company;

/**
 *
 * @author Polis
 */
abstract class Telephone {
    
    private String owner;
    private String number;
    private int secondsproskin;
    private int secondsprosstath;
    
    double[] callCosts = {0.05,0.07,0.08,0.10}; //pinakas me ta kosti twn diaforwn klisewn
    
    Telephone() {
        secondsproskin = 0;
        secondsprosstath = 0;
    }

    public Telephone(String owner, String number) {
        this.owner = owner;
        this.number = number;
        secondsproskin = 0;
        secondsprosstath = 0;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSecondsProsKin() {
        return secondsproskin;
    }

    public void setSecondsProsKin(int secondsproskin) {
        this.secondsproskin = secondsproskin;
    }

    public int getSecondsProsStath() {
        return secondsprosstath;
    }

    public void setSecondsProsStath(int secondsprosstath) {
        this.secondsprosstath = secondsprosstath;
    }

    public double[] getCallCosts() {
        return callCosts;
    }

    public void setCallCosts(double[] callCosts) {
        this.callCosts = callCosts;
    }

    @Override
    public String toString() {
        return "Telephone{" + "Owner=" + owner + ", Number=" + number + '}';
    }
    
    abstract public void dial(String numbertocall);
    abstract public double cost(int k);
}