
package hospital;

public class Medico extends Funcionario {
    String CRM;
    String Especialidade; 
   
     public String getCRM(){
        return  CRM;
    }
    
    public void setCRM(String CRM){
    this.CRM = CRM;
    }
    
    
     public String getEspecialidade(){
        return  Especialidade;
    }
    
    public void setEspecialidade(String Especialidade){
        this.Especialidade = Especialidade;
    }
    
    
    
}
