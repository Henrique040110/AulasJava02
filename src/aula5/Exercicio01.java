package aula5;

import java.util.Scanner;

public class Exercicio01 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean acesso;
        System.out.println("Idade do usuário: ");
        int idade = s.nextInt();
        if (idade >= 18){
            acesso = true;
            System.out.println("Permissão para acessar o sistema concedida");
        } else {
            System.out.println("Permissão para acessar o sistema não concedida.");
        }
        s.close();




















































































    }
}
