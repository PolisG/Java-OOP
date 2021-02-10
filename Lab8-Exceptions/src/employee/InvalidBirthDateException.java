package employee;

/**
 *
 * @author Polis
 */
class InvalidBirthDateException extends Exception {
    InvalidBirthDateException() {}
    
    InvalidBirthDateException(String msg) {
        System.out.println("Invalid Birth Date Exception");
    }
    
}