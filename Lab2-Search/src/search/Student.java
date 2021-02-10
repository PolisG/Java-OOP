package search;

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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
