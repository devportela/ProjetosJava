package exerciciosJava;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de min pra passar pra h: ");
        int min = sc.nextInt();
        int hr = min / 60;
        System.out.println("o valor de horas  é de "+hr);
    }
}
