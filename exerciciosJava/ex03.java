package exerciciosJava;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class ex03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o mês de nascimento (1-12): ");
        int mesNascimento = scanner.nextInt();

        System.out.print("Digite o dia de nascimento: ");
        int diaNascimento = scanner.nextInt();


        LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);
        LocalDate dataAtual = LocalDate.now();


        long diasDeVida = ChronoUnit.DAYS.between(dataNascimento, dataAtual);


        long anosDeVida = diasDeVida / 365;


        System.out.println("Sua idade em anos completos é: " + anosDeVida);


        scanner.close();
    }
}
