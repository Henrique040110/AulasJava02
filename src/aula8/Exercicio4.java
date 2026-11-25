package aula8;

import java.util.Scanner;

public class Exercicio4 {
    static void main() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite um grau Celsius(ºC): ");
        double numero = converterCelsiusParaFahrenheit(s.nextDouble());
        System.out.println("Conversão para Fahrenheit: " + numero + "ºF");
    }
    static double converterCelsiusParaFahrenheit(double C) {
        double F = C * 1.8 + 32;
        return F;
    }
}
