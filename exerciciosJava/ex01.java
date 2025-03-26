package exerciciosJava;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        int n1 = sc.nextInt();
        System.out.println("digite o segundo numero");
        int n2 = sc.nextInt();
        int soma = n1 + n2;
        int multiplicacaoPrimeiro = soma * n1;
        System.out.println("a multiplicacao do resultado pelo primeiro numero é " + multiplicacaoPrimeiro);

        //finalizado
        //somar e multiplicar pelo primeiro numero que o usuario digitou


    }
}
