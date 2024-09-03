/**
 * Determines whether a given number is even or odd.
 *
 * @param numero The number to be checked.
 * @return The string "Par" if the number is even, "Impar" if the number is odd.
 */
package com.app.mobilpymes.shoppingcart;

import java.util.Scanner;

public class ParImpar {
    public ParImpar() {
        super();
        // constructor implementation
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("El número " + numero + " es " + esParOImpar(numero));
    }

    public static String esParOImpar(int numero) {
        return numero % 2 == 0 ? "Par" : "Impar";
    }
}
