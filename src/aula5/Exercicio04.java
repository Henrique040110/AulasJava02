package aula5;

import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double comissao;
        System.out.println("Valor das vendas:");
        double valor1 = s.nextInt();
        if (valor1 < 1000){
            comissao = valor1*0.05;
            System.out.println("Comissão de R$" + comissao);
        } else if (valor1 > 5000) {
            comissao = valor1*0.15;
            System.out.println("Comissão de R$" + comissao);
        } else{
            comissao = valor1*0.10;
            System.out.println("Comissão de R$" + comissao);
        }
        s.close();
    }
}
