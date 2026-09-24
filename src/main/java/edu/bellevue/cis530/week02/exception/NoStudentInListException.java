// I went ahead and made an exception for no students in our get all endpoint

package edu.bellevue.cis530.week02.exception;

public class NoStudentInListException extends RuntimeException {
    public NoStudentInListException(String message) {
        super(message);
    }
}
