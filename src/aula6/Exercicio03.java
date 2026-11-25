package aula6;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num = sc.nextInt();
        long fatorial = 1;
        int i = 1;
        do {
            fatorial *= i;
            i++;
        }

        while (i <= num);
        System.out.println("Fatorial: " + fatorial);
    }
}