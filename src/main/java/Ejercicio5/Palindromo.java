package Ejercicio5;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escriba una palabra sin acento, en minúsculas y seguida de #:");
        String palabra = teclado.next();
        palabra = palabra.substring(0, palabra.length() - 1);

        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length() / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                esPalindromo = false;
                break;
            }
        }
        if (esPalindromo) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }
}
