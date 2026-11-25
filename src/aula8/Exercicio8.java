package aula8;

import java.util.Scanner;

public class Exercicio8 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = calcularFatorial(s.nextInt());
    }
    static int calcularFatorial(int a) {
        int fatorial = 1+a;
        for (int i = 1; i <= a; i++) {}
        return fatorial;
    }
}
