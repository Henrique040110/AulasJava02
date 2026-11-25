package aula7;

import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        boolean[] vetor = new boolean[8];
        int contador = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite true ou false:");
            vetor[i] = sc.nextBoolean();

            if (vetor[i] == true) {
                contador++;
            }
        }

        System.out.println("Quantidade de true: " + contador);

    }
}