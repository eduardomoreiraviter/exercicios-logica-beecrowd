package logica;

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            int A, B, C, D, DIFERENCA;
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
            DIFERENCA = (A * B - C * D);
            System.out.println("DIFERENCA = " + DIFERENCA);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
