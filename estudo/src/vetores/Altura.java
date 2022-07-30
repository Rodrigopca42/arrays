package vetores;

public class Altura {
    
    private String nome;
    private int idade;
    private float medidaAltura;


    public Altura(String nome, int idade, float medidaAltura){
        this.nome = nome;
        this.idade = idade;
        this.medidaAltura = medidaAltura;
    }


   public String getNome(){
        return nome;
   }

   public void setNome(String nome){
    this.nome = nome;
   }

   public int getIdade(){
    return idade;
   }

   public void setIdade(int idade){
    this.idade = idade; 
   }

   public float getMedidaAltura(){
    return medidaAltura;
   }

   public void setMedidaAltura(float medidaAltura){
    this.medidaAltura = medidaAltura;
   }
   


  

}
