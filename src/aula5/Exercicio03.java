package aula5;

import java.util.Scanner;

public class Exercicio03 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o código do produto:");
        int id = s.nextInt();
        switch (id){
            case 1:
                System.out.println("1 - eletrônicos");

                break;
            case 2:
                System.out.println("2 - Alimentos");
                break;
            case 3:
                System.out.println("3 - Vestuário");
                break;
            default:
                System.out.println("Código inválido!");
                break;
        }
        s.close();


































    }
}
