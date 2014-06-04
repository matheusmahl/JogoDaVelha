package br.edu.unoesc.jdavelha;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaJogadoresMain extends javax.swing.JFrame {

    private ArrayList<Jogadores> player = new ArrayList();
    Arquivo arquivo = new Arquivo();

    public ListaJogadoresMain() {
        initComponents();
        arquivo.criarDiretorio();
        player = arquivo.lerArquivo();
        atualizarLista();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstJogadores = new javax.swing.JList();
        btnJogar = new javax.swing.JButton();
        btnSelecionarJogador1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblJogadorSelecionado1 = new javax.swing.JLabel();
        lblJogadorSelecionado2 = new javax.swing.JLabel();
        btnAdicionarJogador = new javax.swing.JButton();
        txfNomeJogador = new javax.swing.JTextField();
        btnDeletarJogador = new javax.swing.JButton();
        btnSelecionarJogador2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstJogadores.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(lstJogadores);

        btnJogar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnJogar.setText("Jogar");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        btnSelecionarJogador1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSelecionarJogador1.setText("Selecionar Jogador 1");
        btnSelecionarJogador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarJogador1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Jogador 1:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Jogador 2:");

        lblJogadorSelecionado1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblJogadorSelecionado2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnAdicionarJogador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAdicionarJogador.setText("Adicionar Jogador");
        btnAdicionarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarJogadorActionPerformed(evt);
            }
        });

        txfNomeJogador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnDeletarJogador.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnDeletarJogador.setText("Deletar Jogador");
        btnDeletarJogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarJogadorActionPerformed(evt);
            }
        });

        btnSelecionarJogador2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSelecionarJogador2.setText("Selecionar Jogador 2");
        btnSelecionarJogador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarJogador2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblJogadorSelecionado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblJogadorSelecionado1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSelecionarJogador1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDeletarJogador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSelecionarJogador2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdicionarJogador)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txfNomeJogador, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblJogadorSelecionado1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(lblJogadorSelecionado2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionarJogador1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelecionarJogador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDeletarJogador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txfNomeJogador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarJogador)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        try {
            if (lblJogadorSelecionado1.getText().isEmpty()) {
                throw new Exception("Jogador 1 não selecionado!");
            }
            if (lblJogadorSelecionado2.getText().isEmpty()) {
                throw new Exception("Jogador 2 não selecionado!");
            }

            Jogo jogar = new Jogo(lblJogadorSelecionado1.getText(), lblJogadorSelecionado2.getText());
            jogar.setVisible(true);
            this.setVisible(false);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "" + e.getMessage());
        }
    }//GEN-LAST:event_btnJogarActionPerformed

    private void btnSelecionarJogador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarJogador1ActionPerformed
        try {
            if (lstJogadores.getSelectedIndex() > -1) {
                Jogadores jogador = player.get(lstJogadores.getSelectedIndex());
                lblJogadorSelecionado1.setText(jogador.getJogador());
            } else {
                throw new Exception("Selecione um jogador na lista!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSelecionarJogador1ActionPerformed

    private void btnAdicionarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarJogadorActionPerformed

        try {
            if (txfNomeJogador.getText().isEmpty()) {
                throw new Exception("Informe um jogador!");
            }
            if (txfNomeJogador.getText().length() > 12) {
                throw new Exception("Nome deve ter no máximo 12 caracteres!");
            } else if (txfNomeJogador.getText().length() < 4) {
                throw new Exception("Nome deve ter no mínimo 4 caracteres!");
            }
            Jogadores jogador = new Jogadores();
            jogador.setJogador(txfNomeJogador.getText());
            player.add(jogador);
            atualizarLista();
            arquivo.gravarArquivo(player);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnAdicionarJogadorActionPerformed

    private void btnSelecionarJogador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarJogador2ActionPerformed
        try {
            if (lstJogadores.getSelectedIndex() > -1) {
                Jogadores jogador = player.get(lstJogadores.getSelectedIndex());
                lblJogadorSelecionado2.setText(jogador.getJogador());
            } else {
                throw new Exception("Selecione um jogador na lista!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSelecionarJogador2ActionPerformed

    private void btnDeletarJogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarJogadorActionPerformed
        try {
            if (lstJogadores.getSelectedIndex() > -1) {
                player.remove(lstJogadores.getSelectedIndex());
                atualizarLista();
            } else {
                throw new Exception("Selecione um jogador na lista!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnDeletarJogadorActionPerformed

    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaJogadoresMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaJogadoresMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaJogadoresMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaJogadoresMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListaJogadoresMain().setVisible(true);
            }
        });

    }

    //Método para atualizar a lista de jogadores
    public void atualizarLista() {
        String[] lista = new String[player.size()];
        for (int i = 0; i < player.size(); i++) {
            lista[i] = player.get(i).getJogador();
        }
        lstJogadores.setListData(lista);
        arquivo.gravarArquivo(player);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarJogador;
    private javax.swing.JButton btnDeletarJogador;
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnSelecionarJogador1;
    private javax.swing.JButton btnSelecionarJogador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblJogadorSelecionado1;
    private javax.swing.JLabel lblJogadorSelecionado2;
    private javax.swing.JList lstJogadores;
    private javax.swing.JTextField txfNomeJogador;
    // End of variables declaration//GEN-END:variables
}
