
package hospital;

public class Paciente extends Pessoa{
    int CodPaciente;
    String Senha; 
    
    
    public int getCodPaciente(){
        return  CodPaciente;
    }
    
    public void setCodPaciente(int CodPaciente){
    this.CodPaciente = CodPaciente;
    }
    
    public String getSenha(){
        return Senha;
        }
      public void setSenha(String Senha){
      this.Senha = Senha; 
      }     
    
}
