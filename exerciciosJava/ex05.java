package exerciciosJava;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu peso (inteiro): ");
        int peso = sc.nextInt();
        System.out.println("agora,digite sua altura: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("seu imc é de " + imc);

    }
}
