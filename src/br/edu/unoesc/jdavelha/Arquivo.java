package br.edu.unoesc.jdavelha;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arquivo {

    private final String ARQUIVO = "C:/Dados/rankingJogo.txt";

    public void gravarArquivo(ArrayList<Jogadores> jogador) {
        try {
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
            BufferedReader leitura = new BufferedReader(new FileReader(ARQUIVO));
            ArrayList<Jogadores> listaLida = new ArrayList();
            for (int i = 0; i < listaLida.size(); i++) {
                listaLida[i]=
                
            }
            return (listaLida);
            leitura.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel ler do arquivo!");
        }
    }
}
