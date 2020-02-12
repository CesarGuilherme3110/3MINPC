
package hospital;


public class Funcionario extends Pessoa{
    int Matricula;
    String Senha;
    
     public int getMatricula(){
        return  Matricula;
    }
    
    public void setMatricula(int Matricula){
    this.Matricula = Matricula;
    }
    
     public String Senha(){
        return  Senha;
    }
    
    public void setSenha(String Senha){
    this.Senha = Senha;
    }
    
}
