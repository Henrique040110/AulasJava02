package aula3;

import java.util.Scanner;

public class Exercicio08 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua nota para o funcionário: ");
        int nota = sc.nextInt();

        switch (nota){
            case 1:
                System.out.println("Precisa melhorar.");
                break;

            case 2:
                System.out.println("Abaixo da média.");
                break;

            case 3:
                System.out.println("Média.");
                break;

            case 4:
                System.out.println("Acima da média.");
                break;

            case 5:
                System.out.println("Excelente!");
                break;

            default:
                System.out.println("Nota inválida.");
        }
    }
}
