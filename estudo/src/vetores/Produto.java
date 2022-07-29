package vetores;

public class Produto {
    
    private String mercadoria;
    private double preco;

    public Produto(String mercadoria, double preco){
        this.mercadoria = mercadoria;
        this.preco = preco;
    }

    public String getMercadoria(){
        return mercadoria;
    }

    public void setMercadoria(String mercadoria){
        this.mercadoria = mercadoria;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }


}