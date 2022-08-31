package com.vanille.restapipractice.official.employee;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find Employee " + id);
    }
}
