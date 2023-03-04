package Ejercicio7;

public class Matriz {

    public static void main(String[] args) {
        final int filas = 20;
        final int columnas = 30;
        char[][] tabla = new char[filas][columnas];
        char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                tabla[j][i] = caracteres[(int) (Math.random() * caracteres.length)];
            }
        }

        for (int j = 0; j < filas; j++) {
            for (int i = 0; i < columnas; i++) {
                System.out.print(tabla[j][i] + " ");
            }
            System.out.println();
        }
    }
}
