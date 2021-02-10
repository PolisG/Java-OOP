package employee;

/**
 *
 * @author Polis
 */
public class Employee {
    
    private int AM;
    private String name;
    private String department;
    private String home_address;

    public Employee(int AM, String name, String department, String home_address) {
        this.AM = AM;
        this.name = name;
        this.department = department;
        this.home_address = home_address;
    }

    public int getAM() {
        return AM;
    }

    public void setAM(int AM) {
        this.AM = AM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getHome_address() {
        return home_address;
    }

    public void setHome_address(String home_address) {
        this.home_address = home_address;
    }

    @Override
    public String toString() {
        return "Employee{" + "AM=" + AM + ", name=" + name + ", department=" + department + ", home_address=" + home_address + '}';
    }
    
}