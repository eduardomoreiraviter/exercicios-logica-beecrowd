package logica;

import java.io.IOException;
import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
            int a, b, PROD;
            a = sc.nextInt();
            b = sc.nextInt();
            PROD = a * b;
            System.out.println("PROD = " + PROD);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
