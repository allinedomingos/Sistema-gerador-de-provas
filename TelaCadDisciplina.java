
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alline
 */
public class TelaCadDisciplina extends javax.swing.JPanel {

   private final TelaInicial pai;
   private String nome;
   private String codigo;
   
   public TelaCadDisciplina(TelaInicial pai) {
        initComponents();
        this.pai = pai;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextNomed = new javax.swing.JTextField();
        jTextCod = new javax.swing.JTextField();
        jBVolta = new javax.swing.JButton();
        jBCadastra = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone-ENEM.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 241, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BankQA System");

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 241, 240));
        jLabel3.setText("Nome disciplina:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 241, 240));
        jLabel5.setText("Codigo disciplina:");

        jTextNomed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNomedActionPerformed(evt);
            }
        });

        jTextCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodActionPerformed(evt);
            }
        });

        jBVolta.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBVolta.setText("Voltar");
        jBVolta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltaActionPerformed(evt);
            }
        });

        jBCadastra.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBCadastra.setText("Cadastrar");
        jBCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 241, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("  Cadastra Disciplina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNomed, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 89, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextNomed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jTextCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBVolta)
                    .addComponent(jBCadastra))
                .addContainerGap(42, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNomedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNomedActionPerformed
    
    }//GEN-LAST:event_jTextNomedActionPerformed

    private void jBVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltaActionPerformed
        TelaCadastro cad = new TelaCadastro(pai);
        cad.setBounds(0,0,this.getWidth(),this.getHeight()); //coloca o 2º painel do tamanho do original
        cad.setVisible(true); //deixa o 2º painel visível
        pai.setContentPane(cad);
    }//GEN-LAST:event_jBVoltaActionPerformed

    private void jTextCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodActionPerformed
     
    }//GEN-LAST:event_jTextCodActionPerformed

    private void jBCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraActionPerformed
        nome = jTextNomed.getText();
        codigo = jTextCod.getText();
        
        //System.out.println(nome);
        //System.out.println(codigo);
        
        CadastraDisciplina cad = new CadastraDisciplina();
        
       try {
            cad.InseriDisciplina(nome, codigo);
            JOptionPane.showMessageDialog(null,"Disciplina cadastrada com Sucesso!");
            jTextNomed.setText("");
            jTextCod.setText("");
       
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao cadastrar disciplina tente novamente!");
           Logger.getLogger(TelaCadDisciplina.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }//GEN-LAST:event_jBCadastraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastra;
    private javax.swing.JButton jBVolta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextCod;
    private javax.swing.JTextField jTextNomed;
    // End of variables declaration//GEN-END:variables
}
