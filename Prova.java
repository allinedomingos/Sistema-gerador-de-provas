
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
public class Prova {

    private int idProva;
    private int idDisciplina;
    private String semestre;
    
    public Prova(){
        
    }

  
    public int getIdProva(int id, String s) throws SQLException {
        
        Connection conexao = ConectaBCD.Conecta();
        
        String sql = "Select idProva From Prova where (idDisciplina="+id+" and semestre='"+s+"')";
        
        Statement stmt = conexao.createStatement(); 
        
        ResultSet rs = stmt.executeQuery(sql);
          
        idProva = rs.getInt("idProva");
        
        stmt.close();
        rs.close();
        conexao.close();
        
       
        return idProva;
    }

    
    public void setIdProva(int idProva) {
        this.idProva = idProva;
    }

       
    public int getIdDisciplina(int idTema) throws SQLException {
        
        Connection conexao = ConectaBCD.Conecta();
        
        String sql = "Select idDisciplina FROM Tema where idTema="+idTema+"";
            
        Statement stmt = conexao.createStatement(); 
        
        ResultSet rs = stmt.executeQuery(sql);
          
        idDisciplina = rs.getInt("idDisciplina");
        
        stmt.close();
        rs.close();
        conexao.close();
        
        
        return idDisciplina;
    }

    public void setIdDisciplina(int idDisciplina) {
        this.idDisciplina = idDisciplina;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    public void InseriProva(String semestre, int idDisciplina) throws SQLException{
        
        try {                             
          
        Connection conexao = ConectaBCD.Conecta();

        String sql = "INSERT INTO Prova (semestre,idDisciplina) " 
                     + "VALUES ('"+semestre+"',"+idDisciplina+")";
        
           try (Statement stmt = conexao.createStatement()) {
                 stmt.executeUpdate(sql);
                 
                 stmt.close();
          
           }  
           
           conexao.close();
       } catch (SQLException ex) {
             
             Logger.getLogger(Prova.class.getName()).log(Level.SEVERE, null, ex);

          }
        
        
    }
    
    

    
}
