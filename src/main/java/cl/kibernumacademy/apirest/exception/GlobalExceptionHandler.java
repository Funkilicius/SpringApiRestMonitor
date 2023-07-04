package cl.kibernumacademy.apirest.exception;

import cl.kibernumacademy.apirest.controllers.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleStudentNotFoundException(StudentNotFoundException ex) {
        return ex.getMessage();
    }

}