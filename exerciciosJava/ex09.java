package exerciciosJava;

import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero n1: ");
        int n1 = sc.nextInt();
        System.out.println("digite o numero n2: ");
        int n2 = sc.nextInt();
        int soma = n1+n2;
        int subtracao = n1- n2;
        int multiplicacao = n1 * n2;
        double divisao = n1 / n2;
        System.out.println("soma: "+soma);
        System.out.println("subtracao: "+subtracao);
        System.out.println("multiplicacao: "+multiplicacao);
        System.out.println("divisao: "+divisao);


    }
}
