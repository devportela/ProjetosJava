package exerciciosJava;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double conducao = 5.20;
        double conducaoDia = conducao * 4;
        double conducaoMes = conducaoDia * 30;
        System.out.println("o total gasto com conduçoes é de " + conducaoMes);

    }
}
