package employee;

/**
 *
 * @author Polis
 */
class InvalidHoursException extends Exception {
    InvalidHoursException() {}
    
    InvalidHoursException(String msg) {
        System.out.println("Invalid Hours Exception");
    }
    
}