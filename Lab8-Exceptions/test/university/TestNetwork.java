package university;

/**
 *
 * @author Polis
 */
public class TestNetwork {
    
    @org.junit.Test
    public void testNetwork() {
        Computer.Network compNet = new Computer.Network();
        Traffic.Network trafNet = new Traffic.Network();		
        System.out.println(trafNet);
        System.out.println(compNet);
    }
    
    public static void main(String args[]){
        org.junit.runner.JUnitCore.main("university.TestNetwork");
    }
    
}
