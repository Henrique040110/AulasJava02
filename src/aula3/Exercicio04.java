package aula3;

import java.util.Scanner;

public class Exercicio04 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor das suas vendas: ");
        double vendas = sc.nextDouble();

        if (vendas < 1000){
            System.out.println("Comissão de 5%.");
            double comissao = vendas * 0.05;
            double vendasFinaiS = vendas + comissao;
            System.out.println("Comissão: " + comissao);
            System.out.println("Vendas + Comissão: " + vendasFinaiS);
        }
        else if (vendas <= 5000){
            System.out.println("Comissão de 10%.");
            double comissao = vendas * 0.1;
            double vendasFinaiS = vendas + comissao;
            System.out.println("Comissão: " + comissao);
            System.out.println("Vendas + Comissão: " + vendasFinaiS);
        }
        else {
            System.out.println("Comissão de 15%.");
            double comissao = vendas * 0.15;
            double vendasFinaiS = vendas + comissao;
            System.out.println("Comissão: " + comissao);
            System.out.println("Vendas + Comissão: " + vendasFinaiS);
        }
    }
}
