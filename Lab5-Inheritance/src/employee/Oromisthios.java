package employee;

/**
 *
 * @author Polis
 */
public class Oromisthios extends Employee {
    
    private double epidoma;
    private int wres;

    Oromisthios(int AM, String name, String department, String home_address, int wres) {
	super(AM, name, department, home_address);
	this.wres = wres;
    }

    public double calculatemoney_Orom() {
	double misthos;
	double tel_misthos;
	misthos = wres*7;
	epidoma = misthos*0.06;
	tel_misthos = epidoma+misthos;
	return tel_misthos;
    }

    @Override
    public String toString() {
	String s = super.toString();
	s+= (" Wres: "+wres);
	return s;
    }

    public void setepidoma(double epidoma) {
	this.epidoma = epidoma;
    }

    public double getepidoma() {
	return this.epidoma;
    }

    public void setwres(int wres) {
	this.wres = wres;
    }

    public int getwres() {
	return this.wres;
    }
    
}