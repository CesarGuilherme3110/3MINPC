package model;
    import java.sql.Connection;
    import  javax.swing.JOptionPane; 
    
    
    
public class Hospital {
    
   
        private int idHospital;
        private String nome;
        private String endereco;

    public int getIdHospital() {
        return idHospital;
    }

    public void setIdHospital(int idHospital) {
        this.idHospital = idHospital;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
        
        
}
