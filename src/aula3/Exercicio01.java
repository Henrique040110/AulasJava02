package aula3;

import java.util.Scanner;

public class Exercicio01 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Acesso aprovado!");
        }
        else {
            System.out.println("Acesso negado!");
        }
    }
}
