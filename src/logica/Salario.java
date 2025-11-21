package logica;

import java.io.IOException;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        try{
            int nFuncionario;
            double hTrabalhadas, vHora, SALARY;
            nFuncionario = sc.nextInt();
            hTrabalhadas = sc.nextDouble();
            vHora = sc.nextDouble();
            SALARY = hTrabalhadas * vHora;
            System.out.println("NUMBER = " + nFuncionario);
            System.out.printf("SALARY = U$ %.2f%n", SALARY);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
