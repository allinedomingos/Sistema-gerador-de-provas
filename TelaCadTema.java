
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author alline
 */
public final class TelaCadTema extends javax.swing.JPanel {
    
    private TelaInicial pai;
    private String disciplina;
    private String nome;
    private String codigo;
    private int idDisciplina;
    
    public void AdicionaCombox(){
        
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jCbDisciplina.getModel();
        comboModel.removeAllElements();
        
         try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select * FROM Disciplinas";
                
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          while(rs.next()){
              
              comboModel.addElement(rs.getString("CodDisciplina"));
 
 
          }
        
          stmt.close();
          rs.close();
          conexao.close();
         
         
        } catch (SQLException ex) {
           Logger.getLogger(TelaConsulta.class.getName()).log(Level.SEVERE, null, ex);
       }
    } 


    public TelaCadTema(TelaInicial pai) {
        initComponents();
        AdicionaCombox();
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
        jLabel6 = new javax.swing.JLabel();
        jCbDisciplina = new javax.swing.JComboBox<>();
        jNomet = new javax.swing.JTextField();
        jTextCodt = new javax.swing.JTextField();
        jBVolta = new javax.swing.JButton();
        jBCadastra = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone-ENEM.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 241, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BankQA System");

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(242, 241, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("   Cadastra Tema");

        jLabel4.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 241, 240));
        jLabel4.setText("Disciplina:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(242, 241, 240));
        jLabel5.setText("Nome Tema:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 241, 240));
        jLabel6.setText("Codigo Tema:");

        jCbDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCbDisciplinaActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBVolta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(jBCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextCodt)
                            .addComponent(jNomet)
                            .addComponent(jCbDisciplina, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCbDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jNomet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jTextCodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBVolta)
                    .addComponent(jBCadastra))
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBVoltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltaActionPerformed
     TelaCadastro cad = new TelaCadastro(pai);
     cad.setBounds(0,0,this.getWidth(),this.getHeight()); //coloca o 2º painel do tamanho do original
     cad.setVisible(true); //deixa o 2º painel visível
     pai.setContentPane(cad);
      
    }//GEN-LAST:event_jBVoltaActionPerformed

    private void jCbDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCbDisciplinaActionPerformed
        
        disciplina = (String) jCbDisciplina.getSelectedItem();
        
    
        try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select idDisciplina FROM Disciplinas where CodDisciplina='"+disciplina+"'";
                
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          idDisciplina = rs.getInt("idDisciplina");
          
          stmt.close();
          rs.close();
          conexao.close();
          
         // System.out.println(idDisciplina);
          
        } catch (SQLException ex) {
           Logger.getLogger(TelaCadTema.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
        
    }//GEN-LAST:event_jCbDisciplinaActionPerformed

    private void jBCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraActionPerformed
        nome = jNomet.getText();
        codigo = jTextCodt.getText();
        
        CadastraTema tema = new CadastraTema();
        
        try {
            tema.InseriTema(nome, codigo, idDisciplina);
            JOptionPane.showMessageDialog(null,"Tema cadastrada com Sucesso!");
            jNomet.setText("");
            jTextCodt.setText("");
       
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao cadastrar, tente novamente!");
           Logger.getLogger(TelaCadTema.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
    }//GEN-LAST:event_jBCadastraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBCadastra;
    private javax.swing.JButton jBVolta;
    private javax.swing.JComboBox<String> jCbDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jNomet;
    private javax.swing.JTextField jTextCodt;
    // End of variables declaration//GEN-END:variables
}
