package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        notas();
        media();
    }

    static ArrayList<Double> lista = new ArrayList<Double>();
    static public void notas(){
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        do {
            System.out.println("Introduzca su nota: (-1 para salir)");
            nota = teclado.nextDouble();
            if (nota >= 0 && nota <= 10){
                lista.add(nota);
                System.out.println("Otra nota, por favor o -1 para terminar... ");
            }
        }while (nota != -1);
    }

    static public void media(){
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma += lista.get(i);
        }

        System.out.println("La media de las notas " + lista + " es: " + suma/lista.size());
    }
}
