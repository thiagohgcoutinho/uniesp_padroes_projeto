package tech.thiagohgcoutinho.Bee;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{

        int X;
        Scanner input = new Scanner(System.in);
        X = input.nextInt();
        int i =1;
        while (i <= X){
            if (i % 2 != 0){
                System.out.println(i);
            }
            i++;
        }






        double valor;

        valor = input.nextDouble();

        if ( valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <=100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }


    }
}

