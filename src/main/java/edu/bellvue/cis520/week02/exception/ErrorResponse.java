// Error Response Record to hold information for use in GlobalExceptionHandler

package edu.bellvue.cis520.week02.exception;

import java.time.LocalDateTime;

public record ErrorResponse(String message, int status, LocalDateTime timestamp) {

}

/*
    As a note I originally had a class but the IDE suggested a Record which does make more
    sense due to the size difference.
 */