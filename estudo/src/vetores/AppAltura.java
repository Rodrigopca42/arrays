package vetores;

import java.util.Scanner;
import vetores.Altura;

public class AppAltura {
    
    public static void main(String[] args) {
        
        int i, n;

        Scanner tec = new Scanner(System.in);
        
        System.out.print("Quantos Casos Sarão Digitados? "); 
        n = tec.nextInt();
        
        Altura[] alt = new Altura[n];

        for(i = 0; i < alt.length; i++){
            System.out.println("Dados da " + (i+1) + "º Pessoa");
            System.out.print("NOME: ");
            String nome = tec.nextLine();
            tec.next();

            System.out.print("IDADE: ");
            int idade = tec.nextInt();

            System.out.print("ALTURA: ");
            float medidaAltura = tec.nextFloat();

            alt[i] = new Altura(nome, idade, medidaAltura);
        }
        tec.close();

        float soma = 0;
        for(i = 0; i < alt.length; i++){
            soma += alt[i].getMedidaAltura();
        }

        float media = soma / alt.length;

        System.out.println(" ");
        System.out.printf("Altura Média: %.2f%n", media);

        int quantIdade = 0;
        for(i = 0; i < alt.length; i++){
            if( alt[i].getIdade() < 16){
                quantIdade++;
            }

        }
        float porcentagem = quantIdade * 100 /  n;

        System.out.println("Pessoas com menos de 16 anos: "+ porcentagem +"%");

        for(i = 0; i < alt.length; i++){
            if( alt[i].getIdade() < 16){
                System.out.println(alt[i].getNome());
            }
        }
}
}