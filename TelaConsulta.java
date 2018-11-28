
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author alline
 */
public final class TelaConsulta extends javax.swing.JPanel {

   private final TelaInicial pai;
   private String disciplina;
   private String tema;
   private int idTema;
   private int idQuestao;
   private String questao;
   private String resposta;
   private String Alternativa;

   
   
   public void AdicionaCombox(){
        
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jCBDisciplina.getModel();
        comboModel.removeAllElements();
        
         try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select * FROM Disciplinas";
                
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          while(rs.next()){
              
              comboModel.addElement(rs.getString("CodDisciplina"));
 
 
          }
          
         
        } catch (SQLException ex) {
           Logger.getLogger(TelaConsulta.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        
        
       
        
    }
            
    public TelaConsulta(TelaInicial pai) {
        initComponents();
        AdicionaCombox();
        this.pai = pai;
        
  
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBTema = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextA = new javax.swing.JTextArea();
        jCBDisciplina = new javax.swing.JComboBox<>();
        jBInicio = new javax.swing.JButton();
        jBConsultar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone-ENEM.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("BankQA System");

        jBTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        jBTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTemaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(248, 236, 236));
        jLabel3.setText("Tema:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(248, 236, 236));
        jLabel4.setText("Disciplina:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(248, 236, 236));
        jLabel5.setText("Questões:");

        jTextA.setColumns(20);
        jTextA.setRows(5);
        jScrollPane3.setViewportView(jTextA);

        jCBDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDisciplinaActionPerformed(evt);
            }
        });

        jBInicio.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBInicio.setText("Voltar");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jBConsultar.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBConsultar.setText("Consultar");
        jBConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConsultarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(242, 241, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consultar Questões");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBConsultar))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jBTema, javax.swing.GroupLayout.Alignment.LEADING, 0, 230, Short.MAX_VALUE)
                                    .addComponent(jCBDisciplina, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jBTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBInicio)
                    .addComponent(jBConsultar))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTemaActionPerformed
       
        tema = (String) jBTema.getSelectedItem();
       
    }//GEN-LAST:event_jBTemaActionPerformed

    private void jBConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConsultarActionPerformed

        
        try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select idQuestao,enunciado,Resposta,Alternativas from Questao q, Tema t where q.idTema=t.idTema and q.idTema=(select idTema from Tema where CodTema='"+tema+"')";
                
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          jTextA.setText("");
          
          
          while(rs.next()){
             
             idQuestao = rs.getInt("idQuestao");
             questao = rs.getString("enunciado");
             resposta = rs.getString("Resposta");
             Alternativa = rs.getString("Alternativas");
             
             
              System.out.println("---------------------");
              System.out.printf("%d)",idQuestao);
              System.out.println(questao);
              System.out.println("Alternativas:");
              System.out.println(Alternativa);
              System.out.println("Resposta:");
              System.out.println(resposta);
              System.out.println("---------------------\n");
              
              
              String id = Integer.toString(idQuestao);
              jTextA.append(id);
              jTextA.append(")");
                //jTextA.setLineWrap(true);
              jTextA.insert(questao, jTextA.getCaretPosition());
              jTextA.append("\n");
              jTextA.append("Alternativas:");
              jTextA.insert(Alternativa, jTextA.getCaretPosition());
              jTextA.append("\n");
              jTextA.append("Resposta:");
              jTextA.insert(resposta, jTextA.getCaretPosition());
              jTextA.append("\n");
              jTextA.append("---------------------\n");

              
          }
          
          
          
          
          
          //jTextA.setText(questao);
          //jTextA.setText("Questão:");
         
          //jTextA.setText(resposta);
         
                  
          
          //rs.close();
          //stmt.close();
         
        } catch (SQLException ex) {
           Logger.getLogger(TelaConsulta.class.getName()).log(Level.SEVERE, null, ex);
       }
        
    }//GEN-LAST:event_jBConsultarActionPerformed

    private void jCBDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDisciplinaActionPerformed
                
         disciplina = (String) jCBDisciplina.getSelectedItem();
        
         //System.out.println(disciplina);
         
         
         try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select CodTema FROM Tema t, Disciplinas d Where t.idDisciplina=d.idDisciplina and t.idDisciplina=(Select idDisciplina From Disciplinas Where CodDisciplina='"+disciplina+"')";
                
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          jBTema.removeAllItems();
          
          while(rs.next()){
              
                jBTema.addItem(rs.getString("CodTema"));
                   
          }
         
        } catch (SQLException ex) {
           Logger.getLogger(TelaConsulta.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jCBDisciplinaActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        this.pai.dispose();
        new TelaInicial().setVisible(true);
        
        
    }//GEN-LAST:event_jBInicioActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBConsultar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JComboBox<String> jBTema;
    private javax.swing.JComboBox<String> jCBDisciplina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextA;
    // End of variables declaration//GEN-END:variables
}
