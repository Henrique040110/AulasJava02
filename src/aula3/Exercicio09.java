package aula3;

import java.util.Scanner;

public class Exercicio09 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite que horas são: ");
        int horas = sc.nextInt();
        if (horas >= 5 && horas <= 12) {
            System.out.println("Período da Manhã.");
        }
        else if (horas > 12 && horas <= 18) {
            System.out.println("Período da Tarde.");
        }
        else if (horas > 18 && horas <= 22) {
            System.out.println("Período da Noite.");
        }
        else if (horas > 23) {
            System.out.println("Horário inválido.");
        }
        else {
            System.out.println("Período da Madrugada.");
        }
    }
}
