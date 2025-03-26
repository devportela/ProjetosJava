package exerciciosJava;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o valor em cm  pra transformar em metros: ");
        int cm = sc.nextInt();
        int valorM = cm / 100;
        System.out.println("o valor em centimetros é de " + valorM);

    }
}
