package vetores;

import java.util.Scanner;

public class MediaAltura {
    public static void main(String[] args) {

        int i, n;
        
        Scanner tec = new Scanner(System.in);
        double[] altura = new double[10];
        
       // System.out.print("Quantos casos? ");
        n = tec.nextInt();

        for(i = 0; i < n; i++){
            altura[i] = tec.nextDouble();
        }

        double soma = 0;
        for (i = 0; i < n; i++){
            soma += altura[i];
        }
         
        double media = soma / n;

        System.out.printf("A Média é: %.2f",media);
        tec.close();

    }
}
