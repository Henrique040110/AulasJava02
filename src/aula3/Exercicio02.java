package aula3;

import java.util.Scanner;

public class Exercicio02 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da compra: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        if (valor > 100){
            System.out.println("Desconto de 10% aplicado.");
            double desconto = valor*0.10;
            double novoValor = valor - desconto;
            System.out.println("Valor final após desconto: " + novoValor);
        }
        else {
            System.out.println("Nenhum desconto aplicado.");
        }
    }
}
