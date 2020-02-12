
package hospital;


public class Hospital {

    
    public static void main(String[] args) {
      Enfermeiro e1 = new Enfermeiro();
      Medico m2 = new Medico();
      Medico  m3 = new Medico();
      Paciente p4 = new Paciente();
        Paciente  p5 = new Paciente();
      
      e1.setNome("Arthur");
      e1.setIdade(16);
      e1.setRG("000000");
      e1.setCPF("000.000.000");
      
      
      m2.setNome("Cesar");
      m2.setIdade(16);
      m2.setRG("000000");
      m2.setCPF("000.000.000");
      
      m3.setNome("Gabrielly");
      m3.setIdade(17);
      m3.setRG("000000");
      m3.setCPF("000.000.000");
      
      p4.setNome("Ryan");
      p4.setIdade(18);
      p4.setRG("000000");
      p4.setCPF("000.000.000");
      
      p5.setNome("Vi Botelho");
      p5.setIdade(16);
      p5.setRG("0000000");
      p5.setCPF("000.000.000");
    }
    
}
