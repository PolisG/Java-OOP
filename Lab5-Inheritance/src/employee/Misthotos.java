package employee;

/**
 *
 * @author Polis
 */
public class Misthotos extends Employee {
    
    private double epidoma;
    private double pos_bonus;
    private int paidia;
    private int xronia;
    
    Misthotos(int AM, String name, String department, String home_address, int paidia, int xronia) {
	super(AM, name, department, home_address);
	this.paidia = paidia;
	this.xronia = xronia;
    }
    
    public double calculatemoney_Misth() {
        double misthos = 700;
        double tel_misthos;
        epidoma = misthos*(paidia*0.05);
        int trieties = (int)(xronia/3);
        double xro_epid = (trieties*10/100)*misthos;
        tel_misthos = epidoma+misthos+xro_epid;
        return tel_misthos;
    }

    @Override
    public String toString() {
	String s = super.toString();
	s+= (" Paidia: "+paidia+" Etoi Ypiresias: "+xronia+" Epidoma: "+epidoma);
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