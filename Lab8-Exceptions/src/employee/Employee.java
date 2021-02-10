package employee;

import java.util.Scanner;

/**
 *
 * @author Polis
 */
public class Employee {
    
    Scanner sc = new Scanner(System.in);
    
    private String name;
    private String birthDate;
    private double[] workingHours = new double[12];
    private double[] overtime = new double[12];
    private double dailyWage;
    private int childNum;
    private double bonusFactor;
    
    Employee() {}

    Employee (String name, String birthDate, double dailyWage, int childNum, double bonusFactor) throws IllegalArgumentException {
        this.name = name;
        this.birthDate = birthDate;
        this.dailyWage = dailyWage;
        
        boolean b;
        int i = 0;
        do {
            b = false;
            try {
                if (i>0)
                    childNum = sc.nextInt();
                this.childNum = childNum;
                i++;
                if (childNum<0)
                    throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException e) {
                System.out.println("O arithmos twn paidiwn de mporei na einai mikroteros tou 0");
                b = true;
            }
        }while (b);
        this.bonusFactor = bonusFactor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public double[] getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours, int i) {
        this.workingHours[i] = workingHours;
    }

    public double[] getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime, int i) {
        this.overtime[i] = overtime;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public int getChildNum() {
        return childNum;
    }

    public void setChildNum(int childNum) {
        this.childNum = childNum;
    }

    public double getBonusFactor() {
        return bonusFactor;
    }

    public void setBonusFactor(double bonusFactor) {
        this.bonusFactor = bonusFactor;
    }
    
    public double ypologismosApodohon(double bonusFactor, int month) {
        if ((month<0)||(month>12))
            throw new ArrayIndexOutOfBoundsException();
        double apodohes = (workingHours[month]+overtime[month])*dailyWage*(1+bonusFactor);
        return apodohes;
    }
    
    public double ypologismosSyntelestiEpidomatos(int childNum) {
        double bF;  //bonusFactor
        try {
            bF = 100-(50/childNum);
        }
        catch(ArithmeticException e) {
            bF = 0;
        }
        return bF;
    }
    
    public void oresErgasias(int i) throws ArrayIndexOutOfBoundsException {
        System.out.println("Synolika oi wres ergasias gia ton "+i+"o mhna einai "+(workingHours[i]+overtime[i]));
    }

    @Override
    public String toString() {
        //public void emfanisiYpallilou()
        return "Employee{" + "Name=" + name + ", Birth date=" + birthDate + ", Daily wage=" + dailyWage + ", Number of children=" + childNum + ", Bonus factor=" + bonusFactor + '}';
    }
    
}
