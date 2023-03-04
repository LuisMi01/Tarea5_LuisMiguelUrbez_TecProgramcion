package Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class MaquinasVotar {
    static Scanner teclado = new Scanner(System.in);
    static ArrayList<Integer> lista = new ArrayList<Integer>();
    public static void main(String[] args) {



        boolean salir = false;
        do {
            int opcion;

            System.out.println("Posibles votaciones: (Debe introducir el numero dos veces para confirmar) ");
            System.out.println("1.- Alvaro Fernandez");
            System.out.println("2.- Gonzalo Cid");
            System.out.println("3.- David Cerdan");
            System.out.println("4.- Jose Luis");
            System.out.println("5.- Numero secreto");

            opcion = teclado.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        votar();
                        break;
                    case 2:
                        votar();
                        break;
                    case 3:
                        votar();
                        break;
                    case 4:
                        votar();
                        break;

                    case 5:
                        System.out.println("Introduzca el numero secreto:");
                        numeroSecreto();
                        salir = true;
                        break;

                    default:
                        System.out.println("Debe ingresar un numero entre el 1 y 4");
                }
            } catch (Exception e) {
                System.out.println("Debe ingresar un numero entre el 1 y 4");
            }

        }while (!salir);

    }

    static public void votar(){
        int contador = teclado.nextInt();
        if (contador >0 && contador <= 4) {
            lista.add(contador);
        }
    }

    static public void numeroSecreto(){

        String codigo = teclado.next();
        if (codigo.equals("68753421")) {
            System.out.println("Resultados:");
            for (int i = 0; i < lista.size(); i++) {
                System.out.println("Voto " + (i+1) + ": " + lista.get(i));
            }
        } else {
            System.out.println("Código especial incorrecto. Los resultados no pueden ser mostrados.");
        }
    }


}
