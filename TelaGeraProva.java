

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author alline
 */
public final class TelaGeraProva extends javax.swing.JPanel {
    
   private String disciplina;
   private String tema;
   private String semestre;
   private String semestreatual;
   private String questao;
   private String Alternativa;
   private String Numq;
   private String data;
   private int idTema;
   private int idProva;
   private int idDisciplina;
   private int idQuestao;
   private final TelaInicial pai;
   private ArrayList<String> listaidQuestao;
   private ArrayList<String> listaTema;
   private ArrayList<String> listaidTema;
  
   

   
   public void AdicionaCombox(){
        
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) jBDisciplina.getModel();
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
          
         
          jTextSemestre.setText("Ex: 2016/1");
          jSemestreAtual.setText("Ex: 2016/1");
          
         
        } catch (SQLException ex) {
           Logger.getLogger(TelaGeraProva.class.getName()).log(Level.SEVERE, null, ex);
       }
    
       
         
         
   }
   
   public void CadastraProva() throws SQLException{
       
       Prova p = new Prova();
       //ProvasGeradas pg = new ProvasGeradas();
      // System.out.println(semestreatual);
      
       try {
       
           idDisciplina = p.getIdDisciplina(idTema);
           p.InseriProva(semestreatual, idDisciplina);
           
                  
       } catch (SQLException ex) {
           Logger.getLogger(TelaGeraProva.class.getName()).log(Level.SEVERE, null, ex);
       }    
       
       
       try {
      
           idProva = p.getIdProva(idDisciplina, semestreatual);
           
                  
       } catch (SQLException ex) {
           Logger.getLogger(TelaGeraProva.class.getName()).log(Level.SEVERE, null, ex);
       }    
       
       
       ProvasGeradas();
       
   
  }


    public void ProvasGeradas() throws SQLException{
        
        ProvasGeradas pg = new ProvasGeradas();
        
        int x = 0;
        int aux_id;
        
        for (x=0; x<listaidQuestao.size(); x++) {
              //System.out.println(listaidQuestao.get(x));
              aux_id = Integer.parseInt(listaidQuestao.get(x));
              pg.InseriProva(idProva, aux_id);
        }
        
    }
   
    public TelaGeraProva(TelaInicial pai) {
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
        jTextSemestre = new javax.swing.JTextField();
        jBGeraProva = new javax.swing.JButton();
        jBInicio = new javax.swing.JButton();
        jTema = new javax.swing.JComboBox<>();
        jBDisciplina = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSemestreAtual = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProva = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Disciplina : ");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Semestre :");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NºQuestões :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone-ENEM.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 3, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BankQA System");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tema : ");

        jTextSemestre.setToolTipText("");
        jTextSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSemestreActionPerformed(evt);
            }
        });

        jBGeraProva.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBGeraProva.setText("Gerar");
        jBGeraProva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGeraProvaActionPerformed(evt);
            }
        });

        jBInicio.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jBInicio.setText("Voltar");
        jBInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInicioActionPerformed(evt);
            }
        });

        jTema.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTemaMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTemaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTemaMouseEntered(evt);
            }
        });
        jTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTemaActionPerformed(evt);
            }
        });

        jBDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDisciplinaActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "26", "26", "27", "28", "29", "30" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 241, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Gera Prova");

        jSemestreAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSemestreAtualActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(242, 241, 240));
        jLabel8.setText("Semestre Atual:");

        jProva.setColumns(20);
        jProva.setRows(5);
        jScrollPane1.setViewportView(jProva);

        jLabel9.setFont(new java.awt.Font("SansSerif", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(242, 241, 240));
        jLabel9.setText("Prova:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(46, 46, 46)
                        .addComponent(jBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jTema, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBGeraProva, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSemestreAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSemestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSemestreAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBInicio)
                    .addComponent(jBGeraProva, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSemestreActionPerformed
       semestre = jTextSemestre.getText();
     
      // System.out.println(semestre);
    }//GEN-LAST:event_jTextSemestreActionPerformed

    private void jBGeraProvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGeraProvaActionPerformed
        
       
       int num = Integer.parseInt(Numq);
       
       String s_idTema;
       String s_idQuestao;
       
       listaidTema = new ArrayList<>();
       listaidQuestao = new ArrayList<>();
       
       try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select distinct enunciado,Alternativas,idTema,q.idQuestao from Questao q, ProvasGeradas h where q.idQuestao=h.idQuestao or q.idQuestao!=h.idQuestao and h.idProva=(Select idProva from Prova where semestre='"+semestre+"') limit "+num+"";
           
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          jProva.setText("");
          
          int i = 1;
          
          while(rs.next()){
 
             questao = rs.getString("enunciado");
             Alternativa = rs.getString("Alternativas");
             idTema = rs.getInt("idTema");
             idQuestao = rs.getInt("idQuestao");
             
             //System.out.println(idQuestao);
             
             s_idTema = Integer.toString(idTema);
             listaidTema.add(s_idTema);
             
             s_idQuestao = Integer.toString(idQuestao);
             listaidQuestao.add(s_idQuestao);
             
              System.out.println("\n");
              System.out.printf("%d)",i);
              System.out.println(questao);
              System.out.println("Alternativas:");
              System.out.println(Alternativa);
              System.out.println("\n");
              
              
              String item = Integer.toString(i);
              jProva.append(item);
              jProva.append(")");
              //jTextA.setLineWrap(true);
              jProva.insert(questao, jProva.getCaretPosition());
              jProva.append("\n");
              jProva.append("Alternativas:");
              jProva.insert(Alternativa, jProva.getCaretPosition());
              jProva.append("\n");
              
              i++;
                   
          }
      
          
          stmt.close();
          rs.close();
          conexao.close();
          
          
          
        } catch (SQLException ex) {
           Logger.getLogger(TelaGeraProva.class.getName()).log(Level.SEVERE, null, ex);
       }

      
       try { 
               
           jTextSemestre.setText("Ex: 2016/1");
           jSemestreAtual.setText("Ex: 2016/1");
           
           CadastraProva();
               
               
       } catch (SQLException ex) {
           Logger.getLogger(TelaGeraProva.class.getName()).log(Level.SEVERE, null, ex);
       }
       
    }//GEN-LAST:event_jBGeraProvaActionPerformed

    private void jBInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInicioActionPerformed
        this.pai.dispose();
        new TelaInicial().setVisible(true);
        
        
    }//GEN-LAST:event_jBInicioActionPerformed

    private void jTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTemaActionPerformed
       
       //tema = (String)jTema.getSelectedItem();
       
      
       
       //listaTema = new ArrayList<>();
       

    }//GEN-LAST:event_jTemaActionPerformed

    private void jBDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDisciplinaActionPerformed
            
        disciplina = (String) jBDisciplina.getSelectedItem();
         
        listaTema = new ArrayList<>();
        
         try {                             
          
          Connection conexao = ConectaBCD.Conecta();
          
          String sql = "Select CodTema FROM Tema t, Disciplinas d Where t.idDisciplina=d.idDisciplina and t.idDisciplina=(Select idDisciplina From Disciplinas Where CodDisciplina='"+disciplina+"')";
                
          Statement stmt = conexao.createStatement(); 
        
          ResultSet rs = stmt.executeQuery(sql);
          
          jTema.removeAllItems();
          
          while(rs.next()){
 
                jTema.addItem(rs.getString("CodTema"));
                   
          }
          
          stmt.close();
          rs.close();
          conexao.close();
          
          
        } catch (SQLException ex) {
           Logger.getLogger(TelaGeraProva.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_jBDisciplinaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Numq = (String) jComboBox1.getSelectedItem();
        //System.out.print(Numq);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jSemestreAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSemestreAtualActionPerformed
       semestreatual = jSemestreAtual.getText();
       //System.out.print(semestreatual);
    }//GEN-LAST:event_jSemestreAtualActionPerformed

    private void jTemaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTemaMouseClicked
 
    }//GEN-LAST:event_jTemaMouseClicked

    private void jTemaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTemaMousePressed
          /* 
          tema = (String)jTema.getSelectedItem();
       
           listaTema.add(tema);
       
    
           for(int i =0;i<listaTema.size();i++){
                System.out.println(listaTema.get(i));
                System.out.println(listaTema.size());
            }
        */

    }//GEN-LAST:event_jTemaMousePressed

    private void jTemaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTemaMouseEntered
       
    }//GEN-LAST:event_jTemaMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jBDisciplina;
    private javax.swing.JButton jBGeraProva;
    private javax.swing.JButton jBInicio;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextArea jProva;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jSemestreAtual;
    private javax.swing.JComboBox<String> jTema;
    private javax.swing.JTextField jTextSemestre;
    // End of variables declaration//GEN-END:variables
}
