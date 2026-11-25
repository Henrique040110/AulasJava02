package aula7;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Vanessa", "Geraldo", "Ramos"};
        boolean encontrado = false;

        System.out.println("Digite o nome que deseja buscar:");
        String busca = sc.nextLine();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(busca)) {
                encontrado = true;
            }
        }

        if (encontrado == true) {
            System.out.println("Nome encontrado!");
        } else {
            System.out.println("Nome não encontrado!");
        }
    }
}
