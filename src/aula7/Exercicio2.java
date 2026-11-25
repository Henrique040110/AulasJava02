package aula7;

import java.util.Scanner;

public class Exercicio2 {
    static void main(String[] args) {

        String[] letras = {"A","B", "C", "D", "E", "F"};
        Scanner s = new Scanner(System.in);
        System.out.println("Escreva uma letra: ");
        String letra = s.nextLine();
        for (int i = 0; i < letras.length; i++){
            boolean encontrada = true;
            if (letras[i].equalsIgnoreCase(letra)){
                System.out.println("Letra na posição: " + i);


            }


        }





























































    }
}
