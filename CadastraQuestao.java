
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alline
 */
public class CadastraQuestao {
    
    private String questao;
    private String resposta;
    private String alternativa;
    private int idTema;
    
    public CadastraQuestao(){
      
    } 
    
    public String getQuestao() {
        return questao;
    }
    
    
    public void setQuestao(String questao) {
        this.questao = questao;
    }
    
    public String getResposta() {
        return resposta;
    }
   
    
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }
    
    
    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }

   
    public void setIdTema(int idTema) {
        this.idTema = idTema;
    }
    
    
    public int getIdTema(String codTema) throws SQLException{
         
        Connection conexao = ConectaBCD.Conecta();
        
        String sql = "Select idTema FROM Tema where CodTema='"+codTema+"'";
            
        Statement stmt = conexao.createStatement(); 
        
        ResultSet rs = stmt.executeQuery(sql);
          
        idTema = rs.getInt("idTema");
        
        stmt.close();
        rs.close();
        conexao.close();
        
        return idTema;
        
    }
    
    
    public void InseriQuestao(String questao, String resposta, String alternativa, int idTema) throws SQLException{
        
        try {                             
          
        Connection conexao = ConectaBCD.Conecta();

        String sql = "INSERT INTO Questao (enunciado,Resposta,Alternativas,idTema) " 
                     + "VALUES ('"+questao+"','"+resposta+"','"+alternativa+"',"+idTema+")";
        
           try (Statement stmt = conexao.createStatement()) {
                 stmt.executeUpdate(sql);
                
                 stmt.close();
     
         
           }  
           
         
         conexao.close();
           
       } catch (SQLException ex) {
             
             Logger.getLogger(CadastraQuestao.class.getName()).log(Level.SEVERE, null, ex);

          }
        
        
    }
    
}
