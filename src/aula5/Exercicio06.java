package aula5;

import java.util.Scanner;

public class Exercicio06 {
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nota 1:");
        double nota1 = s.nextDouble();
        System.out.println("Nota tirada: " + nota1);
        if (nota1 >=7 && nota1 <=10){
            System.out.println("Aprovado.");
        } else if (nota1 >=5 && nota1 <7) {
            System.out.println("Recuperação.");
        } else if (nota1 <5){
            System.out.println("Reprovado.");
        } else{
            System.out.println("Nota invalida!");
        }


    }
}
