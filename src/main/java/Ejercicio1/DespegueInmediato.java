package Ejercicio1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DespegueInmediato {
    public static void main(String[] args) {
        contar();


    }
    static ArrayList<Integer> lista = new ArrayList<Integer>();

    public static void contar(){
        for (int i = 10; i > 0; i--) {
            lista.add(i);
        }
        System.out.println(lista);
    }
}
