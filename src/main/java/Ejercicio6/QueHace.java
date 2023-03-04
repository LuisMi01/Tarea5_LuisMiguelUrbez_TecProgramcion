package Ejercicio6;

public class QueHace {
    public static void main(String[] args) {
        final int tamano = 3;
        int[][] tabla = new int[tamano][tamano];
        int val = 1;

        for (int j = 0; j < tamano; j++) {
            for (int i = 0; i < tamano; i++) {
                tabla[j][i] = val;
                val++;
            }
        }

        for (int j = 0; j < tamano; j++) {
            for (int i = 0; i < tamano; i++) {
                System.out.print(tabla[j][i] + " ");
            }
            System.out.println();
        }
    }
}
