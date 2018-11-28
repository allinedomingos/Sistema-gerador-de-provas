
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
public final class TelaCadQuestao extends javax.swing.JPanel {

   private final TelaInicial pai;
   private String disciplina;
   private String tema;
   private String questao;
   private String resposta;
   private String alternativa;
   private int idTema;
   
     public void AdicionaCombox(){
        
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jDisciplina.getModel();
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

   
    public TelaCadQuestao(TelaInicial pai) {
        initComponents();
        AdicionaCombox();
        this.pai = pai;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBVoltar = new javax.swing.JButton();
        jBCadastra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jResposta = new javax.swing.JTextArea();
        jDisciplina = new javax.swing.JComboBox<>();
        jTema = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jAlternativa = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jQuestao = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone-ENEM.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("    BankQA System");

        jLabel4.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 236, 236));
        jLabel4.setText("Tema:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 236, 236));
        jLabel5.setText("Questão:");

        jLabel6.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(248, 236, 236));
        jLabel6.setText("Resposta:");

        jBVoltar.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBVoltar.setText("Voltar");
        jBVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarActionPerformed(evt);
            }
        });

        jBCadastra.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBCadastra.setText("Cadastrar");
        jBCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastraActionPerformed(evt);
            }
        });

        jResposta.setColumns(20);
        jResposta.setRows(5);
        jScrollPane1.setViewportView(jResposta);

        jDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDisciplinaActionPerformed(evt);
            }
        });

        jTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTemaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 242, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("    Cadastra Questão");

        jLabel8.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 241, 240));
        jLabel8.setText("Alternativa:");

        jAlternativa.setColumns(20);
        jAlternativa.setRows(5);
        jScrollPane4.setViewportView(jAlternativa);

        jQuestao.setColumns(20);
        jQuestao.setRows(5);
        jScrollPane5.setViewportView(jQuestao);

        jLabel9.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(248, 236, 236));
        jLabel9.setText("Disciplina:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTema, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBCadastra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTema, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBCadastra)
                            .addComponent(jBVoltar))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastraActionPerformed
       
       questao = jQuestao.getText();
       alternativa = jAlternativa.getText();
       resposta = jResposta.getText();
       
       CadastraQuestao q = new CadastraQuestao();
            
       try {
           
           idTema = q.getIdTema(tema);
           //System.out.println(idTema);
      
       } catch (SQLException ex) {
           Logger.getLogger(TelaCadQuestao.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       try {        
            
            q.InseriQuestao(questao, resposta, alternativa, idTema);
            jQuestao.setText("");
            jAlternativa.setText("");
            jResposta.setText("");
            
            JOptionPane.showMessageDialog(null,"Questão cadastrada com Sucesso!");
       
            
           
           } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao cadastrar, tente novamente!");
           Logger.getLogger(TelaCadTema.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    
       
    }//GEN-LAST:event_jBCadastraActionPerformed

    private void jDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDisciplinaActionPerformed
         disciplina = (String) jDisciplina.getSelectedItem();
         
         try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select CodTema FROM Tema t, Disciplinas d Where t.idDisciplina=d.idDisciplina and t.idDisciplina=(Select idDisciplina From Disciplinas Where CodDisciplina='"+disciplina+"')";
                
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          jTema.removeAllItems();
          
          while(rs.next()){
 
                jTema.addItem(rs.getString("CodTema"));
                   
          }
         
          conexao.close();
          
        } catch (SQLException ex) {
           Logger.getLogger(TelaConsulta.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jDisciplinaActionPerformed

    private void jBVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarActionPerformed
        TelaCadastro cad = new TelaCadastro(pai);
        cad.setBounds(0,0,this.getWidth(),this.getHeight()); //coloca o 2º painel do tamanho do original
        cad.setVisible(true); //deixa o 2º painel visível
        pai.setContentPane(cad);
    }//GEN-LAST:event_jBVoltarActionPerformed

    private void jTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTemaActionPerformed
       tema = (String) jTema.getSelectedItem();
       
    }//GEN-LAST:event_jTemaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea jAlternativa;
    private javax.swing.JButton jBCadastra;
    private javax.swing.JButton jBVoltar;
    private javax.swing.JComboBox<String> jDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jQuestao;
    private javax.swing.JTextArea jResposta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JComboBox<String> jTema;
    private javax.swing.JTextArea jTextArea3;
    // End of variables declaration//GEN-END:variables
}
