

package br.edu.unoesc.jdavelha.tela;
import java.awt.Color;
import javax.swing.JOptionPane;
public class Main extends javax.swing.JFrame {
boolean vez= false;
int vezes=0;
int rankJ1=0;
int rankEmpate=0;
int rankJ2=0;
String nomeJ1;
String nomeJ2;
Arquivo gravar = new Arquivo();
    public Main() {
        initComponents();
        nomeJ1=JOptionPane.showInputDialog("Jogador1: ",null);
        nomeJ2=JOptionPane.showInputDialog("Jogador2: ",null);
        lblJogador1.setText(nomeJ1);
        lblJogador2.setText(nomeJ2);
        lblNomeJ1.setText(nomeJ1);
        lblNomeJ2.setText(nomeJ2);
        btnCampo1.setForeground(Color.black);
        btnCampo2.setForeground(Color.black);
        btnCampo3.setForeground(Color.black);
        btnCampo4.setForeground(Color.black);
        btnCampo5.setForeground(Color.black);
        btnCampo6.setForeground(Color.black);
        btnCampo7.setForeground(Color.black);
        btnCampo8.setForeground(Color.black);
        btnCampo9.setForeground(Color.black);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCampo2 = new javax.swing.JButton();
        btnCampo3 = new javax.swing.JButton();
        btnCampo4 = new javax.swing.JButton();
        btnCampo7 = new javax.swing.JButton();
        btnCampo8 = new javax.swing.JButton();
        btnCampo1 = new javax.swing.JButton();
        btnCampo5 = new javax.swing.JButton();
        btnCampo6 = new javax.swing.JButton();
        btnCampo9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblJogador1 = new javax.swing.JLabel();
        lblJogador2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblVezJogador = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        lblRankJ1 = new javax.swing.JLabel();
        lblRankEmpates = new javax.swing.JLabel();
        lblRankJ2 = new javax.swing.JLabel();
        lblNomeJ1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNomeJ2 = new javax.swing.JLabel();
        btnLimparRanking = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCampo2.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo2ActionPerformed(evt);
            }
        });

        btnCampo3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo3ActionPerformed(evt);
            }
        });

        btnCampo4.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo4ActionPerformed(evt);
            }
        });

        btnCampo7.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo7ActionPerformed(evt);
            }
        });

        btnCampo8.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo8ActionPerformed(evt);
            }
        });

        btnCampo1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo1.setBorderPainted(false);
        btnCampo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCampo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo1ActionPerformed(evt);
            }
        });

        btnCampo5.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo5ActionPerformed(evt);
            }
        });

        btnCampo6.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo6ActionPerformed(evt);
            }
        });

        btnCampo9.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        btnCampo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampo9ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Jogo da Velha");

        lblJogador1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblJogador1.setText("Jogador 1");

        lblJogador2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblJogador2.setText("Jogador 2");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Vez do jogador:");

        lblVezJogador.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblVezJogador.setText("1");

        btnLimpar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLimpar.setText("Limpar Tabuleiro");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        lblRankJ1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRankJ1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRankJ1.setText("0");

        lblRankEmpates.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRankEmpates.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRankEmpates.setText("0");

        lblRankJ2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblRankJ2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRankJ2.setText("0");

        lblNomeJ1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNomeJ1.setText("Jogador 1");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("Empates");

        lblNomeJ2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNomeJ2.setText("Jogador 2");

        btnLimparRanking.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnLimparRanking.setText("Limpar Ranking");
        btnLimparRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparRankingActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText(":  X");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText(":  O");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNomeJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRankJ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblRankEmpates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblRankJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(lblNomeJ2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparRanking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCampo7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCampo8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCampo9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnCampo4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblJogador1)
                                            .addComponent(lblJogador2))))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblVezJogador)
                                    .addComponent(jLabel3))))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCampo2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampo3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampo1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnCampo5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampo6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampo4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCampo8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampo9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampo7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeJ1)
                            .addComponent(jLabel9)
                            .addComponent(lblNomeJ2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRankJ1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblRankEmpates)
                                .addComponent(lblRankJ2)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJogador1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJogador2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblVezJogador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimparRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCampo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo2ActionPerformed
        btnCampo2.setText(vezDoJogador());
        btnCampo2.setEnabled(false);
        teste();
    }//GEN-LAST:event_btnCampo2ActionPerformed

    private void btnCampo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo3ActionPerformed
        btnCampo3.setText(vezDoJogador());
        btnCampo3.setEnabled(false);
        teste();
    }//GEN-LAST:event_btnCampo3ActionPerformed

    private void btnCampo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo4ActionPerformed
        btnCampo4.setText(vezDoJogador());
        btnCampo4.setEnabled(false);
        teste();
    }//GEN-LAST:event_btnCampo4ActionPerformed

    private void btnCampo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo7ActionPerformed
        btnCampo7.setText(vezDoJogador());
        btnCampo7.setEnabled(false);
        teste();
    }//GEN-LAST:event_btnCampo7ActionPerformed

    private void btnCampo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo8ActionPerformed
        btnCampo8.setText(vezDoJogador());
        btnCampo8.setEnabled(false);
        teste();
    }//GEN-LAST:event_btnCampo8ActionPerformed

    private void btnCampo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo1ActionPerformed
        btnCampo1.setText(vezDoJogador());
        btnCampo1.setEnabled(false);
        teste();
    }//GEN-LAST:event_btnCampo1ActionPerformed

    private void btnCampo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo5ActionPerformed
      btnCampo5.setText(vezDoJogador());
      btnCampo5.setEnabled(false);
      teste();
    }//GEN-LAST:event_btnCampo5ActionPerformed

    private void btnCampo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo6ActionPerformed
        btnCampo6.setText(vezDoJogador());
        btnCampo6.setEnabled(false);
        teste();
    }//GEN-LAST:event_btnCampo6ActionPerformed

    private void btnCampo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampo9ActionPerformed
       btnCampo9.setText(vezDoJogador());
       btnCampo9.setEnabled(false);
       teste();
    }//GEN-LAST:event_btnCampo9ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparTabuleiro();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparRankingActionPerformed
        rankJ1=0;
        lblRankJ1.setText(""+rankJ1);
        rankJ2=0;
        lblRankJ2.setText(""+rankJ2);
        rankEmpate=0;
        lblRankEmpates.setText(""+rankEmpate);
    }//GEN-LAST:event_btnLimparRankingActionPerformed

    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    public void teste(){
        vezes+=1;
            if((btnCampo1.getText() =="X")&&(btnCampo2.getText() =="X")&&(btnCampo3.getText()=="X")){
                JOptionPane.showMessageDialog(null, lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo1.setForeground(Color.red);
                btnCampo2.setForeground(Color.red);
                btnCampo3.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
                
            }else
            if((btnCampo1.getText() =="X")&&(btnCampo5.getText() =="X")&&(btnCampo9.getText()=="X")){            
                JOptionPane.showMessageDialog(null, lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo1.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo9.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
            }else
            if(("X".equals(btnCampo1.getText()))&&("X".equals(btnCampo4.getText()))&&("X".equals(btnCampo7.getText()))){
                JOptionPane.showMessageDialog(null,  lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo1.setForeground(Color.red);
                btnCampo4.setForeground(Color.red);
                btnCampo7.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
            }else
            if((btnCampo2.getText() =="X")&&(btnCampo5.getText() =="X")&&(btnCampo8.getText()=="X")){
                JOptionPane.showMessageDialog(null,  lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo2.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo8.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
            }else
            if((btnCampo4.getText() =="X")&&(btnCampo5.getText() =="X")&&(btnCampo6.getText()=="X")){
                JOptionPane.showMessageDialog(null,  lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo4.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo6.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
            }else
            if((btnCampo7.getText() =="X")&&(btnCampo5.getText() =="X")&&(btnCampo3.getText()=="X")){
                JOptionPane.showMessageDialog(null,  lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo7.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo3.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
            }else
            if((btnCampo7.getText() =="X")&&(btnCampo8.getText() =="X")&&(btnCampo9.getText()=="X")){
                JOptionPane.showMessageDialog(null,  lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo7.setForeground(Color.red);
                btnCampo8.setForeground(Color.red);
                btnCampo9.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
            }else
            if((btnCampo3.getText() =="X")&&(btnCampo6.getText() =="X")&&(btnCampo9.getText()=="X")){
                JOptionPane.showMessageDialog(null,  lblJogador1.getText()+" Ganhou!");
                bloquear();
                btnCampo3.setForeground(Color.red);
                btnCampo6.setForeground(Color.red);
                btnCampo9.setForeground(Color.red);
                rankJ1+=1;
                lblRankJ1.setText(""+rankJ1);
            }else
            
            if((btnCampo1.getText() =="O")&&(btnCampo2.getText() =="O")&&(btnCampo3.getText()=="O")){
                JOptionPane.showMessageDialog(null,  lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo1.setForeground(Color.red);
                btnCampo2.setForeground(Color.red);
                btnCampo3.setForeground(Color.red);
                rankJ2+=1;
                lblRankJ2.setText(""+rankJ2);
            }else
            if((btnCampo1.getText() =="O")&&(btnCampo5.getText() =="O")&&(btnCampo9.getText()=="O")){
                JOptionPane.showMessageDialog(null, lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo1.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo9.setForeground(Color.red);
            }else
            if((btnCampo1.getText() =="O")&&(btnCampo4.getText() =="O")&&(btnCampo7.getText()=="O")){
                JOptionPane.showMessageDialog(null, lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo1.setForeground(Color.red);
                btnCampo4.setForeground(Color.red);
                btnCampo7.setForeground(Color.red);
                rankJ2+=1;
                lblRankJ2.setText(""+rankJ2);
            }else
            if((btnCampo2.getText() =="O")&&(btnCampo5.getText() =="O")&&(btnCampo8.getText()=="O")){
                JOptionPane.showMessageDialog(null, lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo2.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo8.setForeground(Color.red);
                rankJ2+=1;
                lblRankJ2.setText(""+rankJ2);
            }else
            if((btnCampo4.getText() =="O")&&(btnCampo5.getText() =="O")&&(btnCampo6.getText()=="O")){
                JOptionPane.showMessageDialog(null, lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo4.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo6.setForeground(Color.red);
                rankJ2+=1;
                lblRankJ2.setText(""+rankJ2);
            }else
            if((btnCampo7.getText() =="O")&&(btnCampo5.getText() =="O")&&(btnCampo3.getText()=="O")){
                JOptionPane.showMessageDialog(null, lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo7.setForeground(Color.red);
                btnCampo5.setForeground(Color.red);
                btnCampo3.setForeground(Color.red);
                rankJ2+=1;
                lblRankJ2.setText(""+rankJ2);
            }else
            if((btnCampo7.getText() =="O")&&(btnCampo8.getText() =="O")&&(btnCampo9.getText()=="O")){
                JOptionPane.showMessageDialog(null, lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo7.setForeground(Color.red);
                btnCampo8.setForeground(Color.red);
                btnCampo9.setForeground(Color.red);
                rankJ2+=1;
                lblRankJ2.setText(""+rankJ2);
            }else
            if((btnCampo3.getText() =="O")&&(btnCampo6.getText() =="O")&&(btnCampo9.getText()=="O")){
                JOptionPane.showMessageDialog(null, lblJogador2.getText()+" Ganhou!");
                bloquear();
                btnCampo3.setForeground(Color.red);
                btnCampo6.setForeground(Color.red);
                btnCampo9.setForeground(Color.red);
                rankJ2+=1;
                lblRankJ2.setText(""+rankJ2);
            }else
                if(vezes==9){
                JOptionPane.showMessageDialog(null, "Empate!");
                rankEmpate+=1;
                lblRankEmpates.setText(""+rankEmpate);
            }
            gravar.noArquivo(rankJ1,rankJ2,nomeJ1,nomeJ2);
    }
    
    
    public String vezDoJogador(){
        String XO;
        if(vez){
            vez=false;
            XO="O";
            lblVezJogador.setText(""+1);
        }else{
            vez=true;
            XO="X";
            lblVezJogador.setText(""+2);
        }
        return XO;  
    }
    public void bloquear(){  
        btnCampo1.setEnabled(false);       
        btnCampo2.setEnabled(false);   
        btnCampo3.setEnabled(false);      
        btnCampo4.setEnabled(false);       
        btnCampo5.setEnabled(false);       
        btnCampo6.setEnabled(false);        
        btnCampo7.setEnabled(false);
        btnCampo8.setEnabled(false);
        btnCampo9.setEnabled(false); 
    }
    public void limparTabuleiro(){
        btnCampo1.setText(null);
        btnCampo1.setEnabled(true);
        btnCampo2.setText(null);
        btnCampo2.setEnabled(true);
        btnCampo3.setText(null);
        btnCampo3.setEnabled(true);
        btnCampo4.setText(null);
        btnCampo4.setEnabled(true);
        btnCampo5.setText(null);
        btnCampo5.setEnabled(true);
        btnCampo6.setText(null);
        btnCampo6.setEnabled(true);
        btnCampo7.setText(null);
        btnCampo7.setEnabled(true);
        btnCampo8.setText(null);
        btnCampo8.setEnabled(true);
        btnCampo9.setText(null);
        btnCampo9.setEnabled(true);
        vez=false;
        vezes=0;
        lblVezJogador.setText(""+1);
        btnCampo1.setForeground(Color.black);
        btnCampo2.setForeground(Color.black);
        btnCampo3.setForeground(Color.black);
        btnCampo4.setForeground(Color.black);
        btnCampo5.setForeground(Color.black);
        btnCampo6.setForeground(Color.black);
        btnCampo7.setForeground(Color.black);
        btnCampo8.setForeground(Color.black);
        btnCampo9.setForeground(Color.black);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCampo1;
    private javax.swing.JButton btnCampo2;
    private javax.swing.JButton btnCampo3;
    private javax.swing.JButton btnCampo4;
    private javax.swing.JButton btnCampo5;
    private javax.swing.JButton btnCampo6;
    private javax.swing.JButton btnCampo7;
    private javax.swing.JButton btnCampo8;
    private javax.swing.JButton btnCampo9;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblJogador1;
    private javax.swing.JLabel lblJogador2;
    private javax.swing.JLabel lblNomeJ1;
    private javax.swing.JLabel lblNomeJ2;
    private javax.swing.JLabel lblRankEmpates;
    private javax.swing.JLabel lblRankJ1;
    private javax.swing.JLabel lblRankJ2;
    private javax.swing.JLabel lblVezJogador;
    // End of variables declaration//GEN-END:variables
}
