
package hospital;

public class Pessoa {
    String Nome;
    String RG;
    String CPF;
    int Idade;
    
    
     public String getNome(){
        return  Nome;
    }
    
    public void setNome(String Nome){
    this.Nome = Nome;
    }
    
     public String getCPF(){
        return  CPF;
    }
    
    public void setCPF(String CPF){
    this.CPF = CPF;
    }
    
    public String getRG(){
        return  RG;
    }
    
    public void setRG(String RG){
    this.RG = RG;
    }
    
     public int getIdade(){
        return Idade;
    }
    
    public void setIdade(int Idade){
    this.Idade = Idade;
    }
    
}
