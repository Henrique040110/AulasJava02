package aula8;

import java.util.Scanner;

public class Exercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        System.out.println("O número é impar ou par?");
        verificarPar(sc.nextInt());
    }
    static boolean verificarPar(int a){
        if (a % 2 == 0){
            System.out.println("É par");
            return true;
        } else {
            System.out.println("É impar");
            return false;
        }
    }
}
