
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alline
 */

public class ConectaBCD {
    
    public static Connection Conecta() throws SQLException{
        
        Connection conexao = null;
        try {
            
            conexao = DriverManager.getConnection("jdbc:sqlite:meubanco.db"); // posso passar o caminho onde esta o arquivo tbm se eu quiser
            
        }catch (SQLException ex) {
             Logger.getLogger(ConectaBCD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conexao;
    } 
   
}
