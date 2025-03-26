package exerciciosJava;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO A ETEC AUTOMOTIVOS");
        System.out.println("DIGITE SEU NOME PRA CONTINUAR: ");
        String nome = sc.next();
        System.out.println("olá , " + nome);
        System.out.println("VENDEU ALGUM CARRO A VISTA? S/N ");
        String respCarro = sc.next();

        if (respCarro.equals("S")) { // Use .equals() here
            System.out.println("quantos carros foram vendidos a vista: ?  ");
            double respCarseller = sc.nextInt();
            double bonusCar = respCarseller * 100;
            double salarioBase = 2000;
            double salarioCar = salarioBase + bonusCar;
            System.out.println("o seu salario do mes é de " + salarioCar);

        } else {
            double salariosemBug = 2000;
            System.out.println("o seu salario do mes é de " + salariosemBug);
        }
    }
}
