package aula8;

import java.util.Scanner;

public class Exercicio7 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite 3 valores: ");
        int maior = maiorNumero(s.nextInt(), s.nextInt(), s.nextInt());
        System.out.println("Maior valor: " + maior);
    }
    static int maiorNumero(int a, int b, int c){
        if (a > b && a >  c){
            return a;
        } else if (b > a && b > c) {
            return b;
        } else{
            return c;
        }
    }
}
