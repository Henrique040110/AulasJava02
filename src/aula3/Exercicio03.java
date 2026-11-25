package aula3;

import java.util.Scanner;

public class Exercicio03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        switch (codigo) {
            case 1:
                System.out.println("1 - Eletrônicos");
                break;
            case 2:
                System.out.println("2 - Alimentos");
                break;
            case 3:
                System.out.println("3 - Vestuário");
                break;
            default:
                System.out.println("Número inválido.");
                break;
        }
    }
}
