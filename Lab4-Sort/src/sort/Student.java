package sort;

/**
 *
 * @author Polis
 */
public class Student {
    
    private int AM;
    private String name;
    private String surname;
    private int year;

    public Student(int AM, String name, String surname, int year) {
        this.AM = AM;
        this.name = name;
        this.surname = surname;
        this.year = year;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" + "AM=" + AM + ", name=" + name + ", surname=" + surname + ", year=" + year + '}';
    }
    
}
