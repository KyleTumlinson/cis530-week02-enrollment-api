// Class for catching common exceptions such as StudentNotFoundException

package edu.bellevue.cis530.week02.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleStudentNotFoundException(StudentNotFoundException ex){
        HttpStatus status = HttpStatus.NOT_FOUND;

        ErrorResponse errorBody = new ErrorResponse(
                ex.getMessage(),
                status.value(),
                LocalDateTime.now()
        );

        return new ResponseEntity<>(errorBody, status);
    }
    @ExceptionHandler(NoStudentInListException.class)
    public ResponseEntity<ErrorResponse> handleNoStudentInListException(NoStudentInListException ex){
        HttpStatus status = HttpStatus.NO_CONTENT;
        ErrorResponse errorBody = new ErrorResponse(
                ex.getMessage(),
                status.value(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorBody, status);
    }
}