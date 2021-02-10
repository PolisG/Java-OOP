package multiple_inheritance;

/**
 *
 * @author Polis
 */
class Animal {
    
    int age;
    double weight;
    
    Animal() {}
    
    Animal(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        String s;
        s ="age: " + age + "\n";	
        s +="weight: " + weight;	
        return s;
    }
    
}