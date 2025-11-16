package logica;

import java.io.IOException;
import java.util.Scanner;

public class SomaSimples {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
            int A, B, SOMA;
            A = sc.nextInt();
            B = sc.nextInt();
            SOMA = A + B;
            System.out.println("SOMA = " + SOMA);
        }
        catch(Exception e){
            System.out.println(e);
        }

    }

}