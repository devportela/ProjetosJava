package exerciciosJava;

import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("o valor em km pra passar em m");
        int km = sc.nextInt();
        int m = km * 1000;
        System.out.println("o valor em m é de "+m);

    }
}
