package university;

/**
 *
 * @author Polis
 */
public class TestTEI {
    
    @org.junit.Test
    public void testTEI() {
        System.out.println(new TEI.STEF.Informatics());
	System.out.println(new TEI.SEYP.Nursing());
	System.out.println(new TEI.SDO.Marketing());
    }
    
    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("university.TestTEI");
    }
    
}