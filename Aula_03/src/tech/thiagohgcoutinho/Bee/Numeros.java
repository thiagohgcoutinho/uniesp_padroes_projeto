package tech.thiagohgcoutinho.Bee;

import java.util.Scanner;

public class Numeros {

    int x, contPar, contImpar, contPositivos, contNegativos;

    Scanner leitor = new Scanner(System.in);


    public int getContPar() {
        return contPar;
    }

    public void setContPar(int contPar) {
        this.contPar = contPar;
    }

    public int getContImpar() {
        return contImpar;
    }

    public void setContImpar(int contImpar) {
        this.contImpar = contImpar;
    }

    public int getContPositivos() {
        return contPositivos;
    }

    public void setContPositivos(int contPositivos) {
        this.contPositivos = contPositivos;
    }

    public int getContNegativos() {
        return contNegativos;
    }

    public void setContNegativos(int contNegativos) {
        this.contNegativos = contNegativos;
    }

    public void verificar (){
        for (int i = 0; i < 5; i++) {
            x = leitor.nextInt();
            if (x % 2 == 0) {
                contPar++;
            }
            else {
                contImpar++;
            }
            if (x > 0) {
                contPositivos++;
            }
            else if (x < 0) {
                contNegativos++;
            }
        }

    }
        public void apresentarResultado (){
            System.out.println(contPar + " valor(es) par(es)");
            System.out.println(contImpar + " valor(es) impar(es)");
            System.out.println(contPositivos + " valor(es) positivo(s)");
            System.out.println(contNegativos + " valor(es) negativo(s)");
        }



}
