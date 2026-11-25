package aula3;

import java.util.Scanner;

public class Exercicio05 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int quantidadeHoras = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite a quantidade de horas extras: ");
        int quantidadeHorasExtras = scanner.nextInt();

        if (quantidadeHorasExtras == 0){
            System.out.println("Sem horas extras.");
        }
        else if (quantidadeHoras+quantidadeHorasExtras > 40) {
            System.out.println("Quantidade de horas trabalhadas maior que 40.");
            double valorHorasExtras = quantidadeHorasExtras+(quantidadeHoras*0.5);
            System.out.println("Valor a ser pago por horas extras: " + valorHorasExtras);
        }
        else {
            System.out.println("Quantidade de horas extras menor que 40.");
        }
    }
}
