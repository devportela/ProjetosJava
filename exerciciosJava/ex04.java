package exerciciosJava;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite seu peso abaixo: ");
        double peso = sc.nextInt();
        double qtdAgua = peso * 0.040;
        System.out.println("voce deve beber de agua por dia o equivalente á " +qtdAgua+"L");




    }
}
