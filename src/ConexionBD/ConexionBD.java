package ConexionBD;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego y Esteban
 */
public class ConexionBD {
    
    public Connection conex;
    
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conex = DriverManager.getConnection("jdbc:mysql://localhost/parqueadero","root","");
            System.out.println("Conexión Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lo sentimos, ha sucedido un problema inesperado con la conexión");
        }
        return conex;
    }
}