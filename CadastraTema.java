
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alline
 */
public class CadastraTema {
    
    private String nome;
    private String codTema;
    private int idDisciplina;
    private int idTema;
    
    public CadastraTema(){
        
    }

   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getCodTema() {
        return codTema;
    }

    
    public void setCodTema(String codTema) {
        this.codTema = codTema;
    }

    public int getIdDisciplina() {
        return idDisciplina;
    }

   
    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    
     
    public void InseriTema(String nome, String codTema, int idDisciplina) throws SQLException{
    
      try {                             
          
        Connection conexao = ConectaBCD.Conecta();

        String sql = "INSERT INTO Tema (NomeT,CodTema,idDisciplina) " 
                     + "VALUES ('"+nome+"','"+codTema+"','"+idDisciplina+"')";
        
           try (Statement stmt = conexao.createStatement()) {
                 stmt.executeUpdate(sql);
         
           }  
           
       } catch (SQLException ex) {
             
             Logger.getLogger(CadastraTema.class.getName()).log(Level.SEVERE, null, ex);

          }
    
    }
}
