package db;


/**
 *
 * @author Leo - Jazna
 */
public interface IDatabase
{    
    public String DRIVER = "com.mysql.cj.jdbc.Driver";
    public String HOST = "localhost";
    public String PORT = "3306";
    public String DATABASE = "dsyapp";
    public String OPCIONES = "?charSet=LATIN1";
    public String JDBC = "jdbc:mysql://";
    /* Los valores que siguen debes cambiarlos de acuerdo a tus credenciales*/
    public String USERNAME = "tu_user";
    public String PASSWORD ="tu_password";        
}