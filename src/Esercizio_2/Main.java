package Esercizio_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = listaOrdinata(101);
        System.out.println("Lista numeri casuali da 0 a 101 " + lista);
        List<Integer> listaInversa = lista2(lista);
        System.out.println("Lista inversa" + listaInversa);
        lista3(listaInversa, false);
    }
    public static List<Integer> listaOrdinata(int N){
        Random random = new Random();
            List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lista.add(random.nextInt(0, 101));
        }

        return lista;
    }
    public static List<Integer> lista2(List<Integer> lista){
        List<Integer> lista2 = new ArrayList<>();
        Collections.reverse(lista2);
        lista2.addAll(lista);

        return lista;
    }
    public static void lista3(List<Integer> list, boolean b){
        for (int i = 0; i < list.size(); i++) {
            if (b && i % 2 == 0){
                System.out.println("I numeri in posizione pari sono " + list.get(i) );
            } else if (!b && i % 2 != 0){
                System.out.println("I numeri in posizione dispari sono " + list.get(i));
            }
        }
    }
}

