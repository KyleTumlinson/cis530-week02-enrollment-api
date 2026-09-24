// This exception is returned when there is a 404 error for an id

package edu.bellevue.cis530.week02.exception;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(Long studentId) {

        super(String.format("Student with id %d does not exist.", studentId));
    }
}
