package logica;

import java.io.IOException;
import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
            String nome;
            double salarioFixo, vendasEfetuadas, TOTAL, guardaValor;
            nome = sc.next();
            salarioFixo = sc.nextDouble();
            vendasEfetuadas = sc.nextDouble();
            guardaValor = vendasEfetuadas * 0.15;
            TOTAL = salarioFixo + guardaValor;
            System.out.printf("TOTAL = R$ %.2f%n", TOTAL);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
