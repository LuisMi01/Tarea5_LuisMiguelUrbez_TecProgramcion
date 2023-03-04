package Ejercicio8;

import java.util.Scanner;

public class MicroGuerra {
    public static void main(String[] args) {
        int[][] tablero = new int[4][4];
        int posicionBarcoX = (int) (Math.random() * 4);
        int posicionBarcoY = (int) (Math.random() * 4);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de barcos!");
        boolean continuarJugando = true;

        while (continuarJugando) {
            System.out.print("Ingrese la fila (0-3): ");
            int fila = scanner.nextInt();
            System.out.print("Ingrese la columna (0-3): ");
            int columna = scanner.nextInt();

            if (fila == posicionBarcoX && columna == posicionBarcoY) {
                System.out.println("¡Felicidades! ¡Hundiste mi barco!");
                continuarJugando = false;
            } else {
                if (fila < 0 || fila > 3 || columna < 0 || columna > 3) {
                    System.out.println("Oops, esa no es una posición válida. Intente nuevamente.");
                } else {
                    System.out.println("Lo siento, ¡fallaste! Inténtalo de nuevo.");
                }
            }
        }

        scanner.close();
    }
}
