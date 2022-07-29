package vetores;

import java.util.Scanner;

public class AppProdutos {
    
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int n = tec.nextInt();
        Produto[] vet = new Produto[n];


        for(int i = 0; i < vet.length; i++){
            tec.next();
            String mercadoria = tec.nextLine();
            double preco = tec.nextDouble();
            vet[i] = new Produto(mercadoria, preco);
        }

        double soma = 0;
        for(int i = 0; i < vet.length; i++){
            soma += vet[i].getPreco();
        }

        double media = soma / vet.length;

        System.out.printf("A média dos preços é: %.2f%n", media);

        tec.close();
    }
}
