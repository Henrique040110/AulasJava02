package aula8;

import java.util.Scanner;

public class Exercicio5 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite 3 notas: ");
        double media = calcularMedia(s.nextDouble(), s.nextDouble(), s.nextDouble());
        System.out.println("Média total das notas: " + media);
    }
    static double calcularMedia(double a, double b, double c){
        return (a + b + c)/3;
    }
}
