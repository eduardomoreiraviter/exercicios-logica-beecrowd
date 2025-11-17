package logica;

import java.io.IOException;
import java.util.Scanner;

public class MediaUm {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try {
            double A, B, MEDIA;
            A = sc.nextDouble();
            B = sc.nextDouble();
            MEDIA = (A * 3.5 + B * 7.5) / 11;
            System.out.printf("MEDIA = %.5f%n", MEDIA);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
