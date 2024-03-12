package Esercizio_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero intero che rappresenta il numero di elementi da inserire");
        int N = Integer.parseInt(scanner.nextLine());

        Set<String> duplicateWords = new HashSet<>();
        Set<String> distinctWords  = new HashSet<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Inserisci la parola " + (i + 1) + ":");

            String parole = scanner.nextLine();
            if (distinctWords.add(parole)){

            }




        }
        System.out.println("Parole duplicate " + duplicateWords);
        System.out.println("Parole distinte " + distinctWords.size());
        System.out.println("Parole distinte " + distinctWords);
    }
}