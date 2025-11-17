package logica;

import java.io.IOException;
import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            int A, B, X;
            A = sc.nextInt();
            B = sc.nextInt();
            X = A + B;
            System.out.println("X = " + X);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
