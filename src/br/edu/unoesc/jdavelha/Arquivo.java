package br.edu.unoesc.jdavelha;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arquivo {

    private final String ARQUIVO = "C:/Dados/Jogadores.txt";
    File file = new File(ARQUIVO);

    public void gravarArquivo(ArrayList<Jogadores> jogador) {
        try {
            if(!file.exists())
                file.createNewFile();
            BufferedWriter wr = new BufferedWriter(new FileWriter(ARQUIVO));
            for (int i = 0; i < jogador.size(); i++) {
                String linha = jogador.get(i).getJogador();
                wr.write(linha);
                wr.newLine();
            }
            wr.flush();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel gravar no arquivo!");
        }
    }

    public ArrayList<Jogadores> lerArquivo() {
        try {
            if(!file.exists())
                file.createNewFile();
            BufferedReader leitura;
            leitura = new BufferedReader(new FileReader(ARQUIVO));
            ArrayList<Jogadores> listaLida = new ArrayList();
            String linha=null;
            while((linha=leitura.readLine())!=null){
                Jogadores player = new Jogadores();
                player.setJogador(linha);
                listaLida.add(player); 
            }
            leitura.close();
            return (listaLida);   
        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel ler do arquivo!");
        }
    }
}
