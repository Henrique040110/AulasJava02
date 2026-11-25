package aula3;

import java.util.Scanner;

public class Exercicio07 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.println("Segundo número: ");
        int segundo = scanner.nextInt();
        System.out.println("Escolha a operação");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("==========SOMA==========");
                System.out.println("Resultado do soma: " + (primeiro + segundo));
                break;
            case 2:
                System.out.println("==========SUBTRAÇÃO==========");
                System.out.println("Resultado da subtração: " + (primeiro - segundo));
                break;
            case 3:
                System.out.println("==========MULTIPLICAÇÃO==========");
                System.out.println("Resultado da multiplicação: " + (primeiro * segundo));
                break;
            case 4:
                System.out.println("==========DIVISÃO==========");
                System.out.println("Resultado da divisor: " + (primeiro / segundo));
        }
    }
}
