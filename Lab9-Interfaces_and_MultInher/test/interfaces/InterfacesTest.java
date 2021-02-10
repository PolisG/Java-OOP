package interfaces;

/**
 *
 * @author Polis
 */
public class InterfacesTest {
    
    @org.junit.Test
    public void test() {
        Photograph photo = new Photograph("near mint", 1000, false);
        
        System.out.println("\n"+"Photograph condition: "+photo.getDescription());
        System.out.println("A reasonable price would be "+photo.getApodektiTimi(85)+" euros");
        
        AgoraParadosi ap = new AgoraParadosi("pristine", 75000, (float)23.48, true, 65, (float)154.17, (float)1052.4, (float)84.38);
        
        System.out.println("\n"+"Item condition: "+ap.getDescription());
        System.out.println("A reasonable price would be "+ap.getApodektiTimi((float)81.25)+" euros");
        System.out.println("Fragile item: "+ap.isFragile());
    }
    
    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("interfaces.InterfacesTest");
    }
}
