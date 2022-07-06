import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //metodo con las herramientas de conexion
    public Connection get_connection(){
        Connection connection = null;
        try {
            //los parametros que se reciben son los datos de conexion a la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
            /*if (connection != null){
                System.out.println("Conexion a la base de datos fue exitosa");
            }*/
            //catch es para manejar la excepcion si no se pudo conectar para enviar el mensaje de error
        }catch (SQLException e){
            System.out.println(e);
        }
        return connection;//retornar el objeto de Tipo Connection
    }
}
