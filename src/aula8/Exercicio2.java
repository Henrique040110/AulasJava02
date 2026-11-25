package aula8;

import java.util.Scanner;

public class Exercicio2 {
    static void main() {
    Scanner s =  new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = somar(s.nextInt(), s.nextInt());
        System.out.println("Soma dos dois valores é igual a: " + numero);
    }
    static int somar(int a, int b) {
        return a + b;
    }

}
