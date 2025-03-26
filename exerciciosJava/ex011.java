package exerciciosJava;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor de mililitros pra calcular pra litros: ");
        double valorMililitros = sc.nextDouble();
        double valorLitros = valorMililitros / 1000;
        System.out.println("o valor em mililitros é de " + valorLitros);
    }
}
