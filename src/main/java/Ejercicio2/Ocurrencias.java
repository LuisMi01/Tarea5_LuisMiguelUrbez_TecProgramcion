package Ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ocurrencias {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        contar();
    }

    static ArrayList<Integer> lista = new ArrayList<Integer>();
    public static void contar(){
        int respuesta = teclado.nextInt();


        do {
            System.out.println("Cual es tu numero?");
            respuesta = teclado.nextInt();
            lista.add(respuesta);
        }while(respuesta != -1);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("El numero " + i + " se repite " + lista.get(i)+ " veces");
        }
    }

    public static void repetidos(){

    }
}
