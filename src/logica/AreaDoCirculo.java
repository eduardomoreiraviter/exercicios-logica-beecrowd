package logica;

import java.io.IOException;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        try{
            double n = 3.14159;
            double area, raio;
            raio = sc.nextDouble();
            area = n * (raio * raio);
            System.out.printf("A=%.4f%n", area);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
