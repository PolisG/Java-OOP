package employee;

/**
 *
 * @author Polis
 */
public class Proistamenos extends Employee {
    
    private double epidoma;
    private double pos_bonus;
    private int paidia;
    private int xronia;
    
    Proistamenos(int AM, String name, String department, String home_address, int paidia, int xronia) {
	super(AM, name, department, home_address);
	this.paidia = paidia;
	this.xronia = xronia;
    }

    public double calculatemoney_Prois() {
	double misthos = 700;
	double tel_misthos = 0;
	epidoma = misthos*(paidia*0.05);
	int trieties = (int)(xronia/3);
	double xro_epid = (trieties*10/100)*misthos;
	tel_misthos = epidoma+misthos+xro_epid;
	pos_bonus = tel_misthos*10/100;
	tel_misthos = tel_misthos+pos_bonus;
	return tel_misthos;
    }

    @Override
    public String toString() {
	String s = super.toString();
	s+= (" Epidoma: "+epidoma+" Pososto Bonus: "+pos_bonus+" Paidia: "+paidia+" Etoi Ypiresias "+xronia);
	return s;
    }

    public void setepidoma(double epidoma) {
	this.epidoma = epidoma;
    }

    public double getepidoma() {
	return this.epidoma;
    }

    public void setpos_bonus(double pos_bonus) {
	this.pos_bonus = pos_bonus;
    }

    public double getpos_bonus() {
	return this.pos_bonus;
    }

    public void setpaidia(int paidia) {
	this.paidia = paidia;
    }

    public int getpaidia() {
	return this.paidia;
    }

    public void setxronia(int xronia) {
	this.xronia = xronia;
    }

    public int getxronia() {
	return this.xronia;
    }
    
}