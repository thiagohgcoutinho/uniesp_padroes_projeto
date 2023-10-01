package tech.thiagohgcoutinho.Bee;

import java.util.Scanner;

public class URI1070 {
    public static void main(String[] args) {
        int X;

        Scanner input = new Scanner(System.in);
        X = input.nextInt();

        for (int i = X; i <= X + 11; i++){
           if (i%2!=0){
                System.out.println(i);
            }

        //int i = 0;

        //while (i<6) {
        //    if (X % 2 == 1){
        //        System.out.println(X);
        //        i++;
        //    }
        //    X++;
        }


    }
}
