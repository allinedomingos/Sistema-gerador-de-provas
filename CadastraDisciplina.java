
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alline
 */
public class CadastraDisciplina {
    
    private String nome;
    private String codDisciplina;
    
    public CadastraDisciplina(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;  
    }

    public String getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
    }
    
    public void InseriDisciplina(String nome, String codDisciplina) throws SQLException{
        
       try {                             
          
        Connection conexao = ConectaBCD.Conecta();

        String sql = "INSERT INTO Disciplinas (NomeD,CodDisciplina) " 
                     + "VALUES ('"+nome+"','"+codDisciplina+"')";
        
           try (Statement stmt = conexao.createStatement()) {
                 stmt.executeUpdate(sql);
              
                  stmt.close();
          
           }  
           
         conexao.close();
           
       } catch (SQLException ex) {
             
             Logger.getLogger(CadastraDisciplina.class.getName()).log(Level.SEVERE, null, ex);

          }
    }
    
}
