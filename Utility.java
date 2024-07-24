package org.apache.maven;

public class Utility {
    public static boolean validatePrice(double price) {
        return price > 0;
    }

    public static boolean validateQuantity(int quantity) {
        return quantity >= 0;
    }
}

