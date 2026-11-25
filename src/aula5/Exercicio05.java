package aula5;

import java.util.Scanner;

public class Exercicio05 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Horas trabalhadas: ");
        int horas_trabalhadas = s.nextInt();
        System.out.println("Fez hora extra?");
        boolean FezHoraExtra = s.nextBoolean();
        if (FezHoraExtra == true && horas_trabalhadas > 40) {
            System.out.println("Horas extras trabalhadas");
            double horaExtra = horas_trabalhadas * 0.50;
            double valorPago = horas_trabalhadas+horaExtra;
            System.out.println("Valor a ser pago a mais pelas horas extras: " + valorPago);


        }
    s.close();

    }


}
