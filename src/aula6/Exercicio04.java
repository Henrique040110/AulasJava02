package aula6;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        boolean primo = numero > 1;

        for(int i = 2; i < numero; i++){
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if(primo == true){
            System.out.println(numero + " é primo.");
        }
        else {
            System.out.println(numero + " não é primo.");
        }
        sc.close();
    }
}
