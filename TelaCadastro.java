
/**
 *
 * @author alline
 */
public class TelaCadastro extends javax.swing.JPanel {

    private TelaInicial pai;
    
    public TelaCadastro(TelaInicial pai) {
        initComponents();
        this.pai = pai;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBCDisciplina = new javax.swing.JButton();
        jBCQuestao = new javax.swing.JButton();
        jBInicio = new javax.swing.JButton();
        jBTema = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone-ENEM.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 241, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BankQA System");

        jBCDisciplina.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBCDisciplina.setText("Disciplina");
        jBCDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCDisciplinaActionPerformed(evt);
            }
        });

        jBCQuestao.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBCQuestao.setText("Questão");
        jBCQuestao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCQuestaoActionPerformed(evt);
            }
        });

        jBInicio.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBInicio.setText("Voltar");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jBTema.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBTema.setText("Tema");
        jBTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTemaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 241, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastrar");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jBTema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCQuestao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCDisciplina, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBCDisciplina)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBTema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCQuestao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jBInicio)
                .addContainerGap(41, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCDisciplinaActionPerformed
     TelaCadDisciplina disp = new TelaCadDisciplina(pai);
     disp.setBounds(0,0,this.getWidth(),this.getHeight()); //coloca o 2º painel do tamanho do original
     disp.setVisible(true); //deixa o 2º painel visível
     pai.setContentPane(disp); 
     
    }//GEN-LAST:event_jBCDisciplinaActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        this.pai.dispose();
        new TelaInicial().setVisible(true);
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jBTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTemaActionPerformed
       TelaCadTema tema = new TelaCadTema(pai);
       tema.setBounds(0,0,this.getWidth(),this.getHeight()); //coloca o 2º painel do tamanho do original
       tema.setVisible(true); //deixa o 2º painel visível
       pai.setContentPane(tema);
    }//GEN-LAST:event_jBTemaActionPerformed

    private void jBCQuestaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCQuestaoActionPerformed
       TelaCadQuestao questao = new TelaCadQuestao(pai);
       questao.setBounds(0,0,this.getWidth(),this.getHeight());//coloca o 2º painel do tamanho do original
       questao.setVisible(true); //deixa o 2º painel visível
       pai.setContentPane(questao); 
    }//GEN-LAST:event_jBCQuestaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCDisciplina;
    private javax.swing.JButton jBCQuestao;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBTema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
