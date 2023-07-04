package cl.kibernumacademy.apirest.controllers;

public class StudentNotFoundException extends RuntimeException {

  public StudentNotFoundException(String message) {
    super(message);
  }
}
