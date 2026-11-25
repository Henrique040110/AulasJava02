package aula8;

import java.util.Scanner;

public class Exercicio3 {
    static void main() {
        Scanner s =  new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = dobrar(s.nextInt());
        System.out.println("O dobro desse número é: " + numero);
    }
    static int dobrar(int a){
        return a * 2;
    }
}
