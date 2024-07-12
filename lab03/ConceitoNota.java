package lab03;

import java.util.Scanner;

public class Condicionais3 {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        System.out.println("Digite a sua nota:");
        String nota = sc.nextDouble();

        if (nota <= 100 && nota <= 91) {
            System.out.println("Conceito A");

        }else if(nota <= 90 && nota <= 81) {
            System.out.println("Conceito B");

        }else if (nota <= 80 && nota <= 71) {
            System.out.println("Conceito C");
            
        }
        
        
    }
}
