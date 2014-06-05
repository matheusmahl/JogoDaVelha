package br.edu.unoesc.jdavelha;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arquivo {

    //Definição do local do arquivo
    private final String ARQUIVO = "C:/JogoDaVelha/Jogadores.txt";
    private final String DIRETORIO = "C:/JogoDaVelha";
    File file = new File(DIRETORIO);
    File arquivo = new File(ARQUIVO);

    //Criação de diretório e arquivo
    public void criarDiretorio() {
        try {
            file.mkdir();
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel criar o arquivo!");
        }
    }

    //Método para gravar no arquivo
    public void gravarArquivo(ArrayList<Jogadores> jogador) {
        try {

            //Gravação no arquivo
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

    //Método para ler do arquivo
    public ArrayList<Jogadores> lerArquivo() {
        try {
            //Leitura do arquivo
            BufferedReader leitura;
            leitura = new BufferedReader(new FileReader(ARQUIVO));
            ArrayList<Jogadores> listaLida = new ArrayList();
            String linha = null;
            while ((linha = leitura.readLine()) != null) {
                Jogadores player = new Jogadores();
                player.setJogador(linha);
                listaLida.add(player);
            }
            leitura.close();
            //Retorno de arraylist
            return (listaLida);
        } catch (Exception e) {
            throw new RuntimeException("Não foi possivel ler do arquivo!");
        }
    }
    
    public void arquivoAjuda(){
        
    }
}
