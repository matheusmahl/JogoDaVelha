


package br.edu.unoesc.jdavelha.tela;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JOptionPane;

public class Arquivo {
    private final String ARQUIVO = "C:/Dados/rankingJogo.txt";
    
    public void noArquivo(int rankJ1,int rankJ2,String nomeJ1,String nomeJ2){
        try{
            BufferedWriter wr = new BufferedWriter(new FileWriter(ARQUIVO));
            String rank = nomeJ1+"|"+rankJ1+"|"+nomeJ2+"|"+rankJ2;
            wr.write(rank);
           // wr.newLine();
            wr.flush();
            wr.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar no arquivo!");
        }
        
    }
}
