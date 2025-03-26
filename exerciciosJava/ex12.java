package exerciciosJava;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor em metros (m) pra transformar em centimetros: ");
        double m = sc.nextDouble();
        double valorCm = m * 100;
        System.out.println("o valor em centimetros é de "+valorCm);

    }
}
