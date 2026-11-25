package aula3;

import java.util.Scanner;

public class Exercicio06 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua nota: ");
        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("Reprovado.");
        }
        else if (nota < 7) {
            System.out.println("Recuperação.");
        }
        else if (nota <= 10) {
            System.out.println("Aprovado!");
        }
        else {
            System.out.println("Nota inválida.");
        }
    }
}
