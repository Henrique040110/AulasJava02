package aula5;

import java.util.Scanner;

public class Exercicio02 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Primeiro produto: ");


        double valor1 = s.nextDouble();
        System.out.println("O valor do primeiro produto é: R$" + valor1);

        System.out.println("Segundo produto: ");
        double valor2 = s.nextDouble();
        double compra = valor1 + valor2;
        System.out.println("O valor do segundo produto é: R$" + valor2);
        System.out.println("Valor total da compra: R$" + compra);
        if (compra >=  100){
            double desconto = (compra/100)*10;
            System.out.println("O desconto aplicado foi de: R$" + desconto);
            System.out.println("Valor com desconto: R$" + (compra-desconto));
        } else{
            System.out.println();
            System.out.println("Valor menor que R$100, se o valor estiver um pouco abaixo do valor de desconto," +
                            "\nrecomendamos que adicione mais produtos para receber o desconto máximo.");
        }

        s.close();



















    }
}
