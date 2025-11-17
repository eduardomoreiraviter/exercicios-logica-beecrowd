package logica;

import java.io.IOException;
import java.util.Scanner;

public class MediaDois {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
            double A, B, C, MEDIA;
            A = sc.nextDouble();
            B = sc.nextDouble();
            C = sc.nextDouble();
            MEDIA = (A * 2  + B * 3 + C * 5 ) / 10;
            System.out.printf("MEDIA = %.1f%n ", MEDIA);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
