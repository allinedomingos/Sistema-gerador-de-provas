
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alline
 */
public class ProvasGeradas {
    
    private int idProva;
    private int idQuestao;
    
    
    public ProvasGeradas(){
        
    }

    public int getIdProva() {
        return idProva;
    }

    
    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }
    
    public int getIdQuestao() {
        return idQuestao;
    }

    
    public void setIdQuestao(int idQuestao) {
        this.idQuestao = idQuestao;
    }
    
    
    public void InseriProva(int idProva, int idQuestao) throws SQLException{

      try {                             

      Connection conexao = ConectaBCD.Conecta();

      String sql = "INSERT INTO ProvasGeradas (idProva,idQuestao) " 
                   + "VALUES ("+idProva+","+idQuestao+")";

         try (Statement stmt = conexao.createStatement()) {
               stmt.executeUpdate(sql);

               stmt.close();

         }  

         conexao.close();
     } catch (SQLException ex) {

           Logger.getLogger(ProvasGeradas.class.getName()).log(Level.SEVERE, null, ex);

       }
    }
}
