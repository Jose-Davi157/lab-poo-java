package lab03;

import java.util.Scanner;

public class VolumeCondicional {
    
    public static void main(String[] args){
        System.out.println("------------------");
        System.out.println("VOLUME DA PIRÂMIDE");
        System.out.println("------------------");

        var sc = new Scanner (System.in);
        System.out.println("Digite o valor da base: ");
        var base = sc.nextInt();

        System.out.println("Digite o valor da altura: ");
        var altura = sc.nextInt();

        if (altura > 0 && base > 0 ){
            var volume = base*base*altura;
            System.out.println("O volume é: " + volume);

        }else{
            System.out.println("Não foi possível realizar esta operação! ");
    }
  }
}
