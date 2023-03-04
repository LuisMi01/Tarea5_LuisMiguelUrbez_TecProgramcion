package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ocurrencias {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] contador = new int[10];

        int numero = 0;
        do {
            System.out.print("Indicar un valor comprendido entre 0 y 9 o -1 para terminar: ");
            numero = entrada.nextInt();
            if (numero >= 0 && numero <= 9) {
                contador[numero]++;
                System.out.print("Otro valor, por favor o -1 para terminar... ");
            }
        } while (numero != -1);

        for (int i = 0; i < 10; i++) {
            System.out.println("Cantidad de " + i + ": " + contador[i]);
        }

    }
}
