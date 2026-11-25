package aula6;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int atual = sc.nextInt();
        int anterior = 0;
        int contador = 0;

        while(contador < 10){
            System.out.println(anterior);
            int proximo = anterior + atual;

            anterior = atual;
            atual = proximo;

            contador++;
        }
    }
}
