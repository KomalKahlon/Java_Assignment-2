package org.apache.maven;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ExceptionHandling {
    public static void handleException(Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
    }

    public static void handleInputMismatchException(InputMismatchException e) {
        System.out.println("Invalid input type. Please enter the correct data type.");
    }

    public static void handleNoSuchElementException(NoSuchElementException e) {
        System.out.println("Element not found: " + e.getMessage());
    }

    public static void handleIllegalArgumentException(IllegalArgumentException e) {
        System.out.println("Illegal argument: " + e.getMessage());
    }
}

