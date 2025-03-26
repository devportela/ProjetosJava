package exerciciosJava;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO A ETEC SOFTWARES");
        System.out.println("DIGITE SEU NOME PRA CONTINUAR: ");
        String nome = sc.next();
        System.out.println("olá , " + nome);
        System.out.println("CORRIGIU ALGUM BUG ? S/N ");
        String respBug = sc.next();

        if (respBug.equals("S")) { // Use .equals() here
            System.out.println("quantos bugs foram resolvidos: ? ");
            double respNumberBugs = sc.nextInt();
            double bonusBug = respNumberBugs * 200.00;
            double salarioBase = 4500.00;
            double salarioBugs = salarioBase + bonusBug;
            System.out.println("o seu salario do mes é de " + salarioBugs);

        } else {
            double salariosemBug = 4500.0;
            System.out.println("o seu salario do mes é de " + salariosemBug);
        }
    }
}
