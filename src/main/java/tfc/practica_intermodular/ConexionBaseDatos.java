package tfc.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBaseDatos {
    
        // Configuración de la conexión a la base de datos MySQL
        String url = "jdbc:mysql://localhost:3306/practica_intermodular_BDD_apr";
        String usuario = "root";
        String contraseña = "Med@c";

        /*Sentencias SQL
        --opcion1: Traer todos los datos de mysql -- menos eficiente
        --opcion2: Consultar los datos de un planeta específico en la base de datos sin tener que traer todos los datos de una sola vez.  --más eficiente */
        
        //consulta Marte
        String sqlMarte = "SELECT * from Planeta WHERE nombre = 'Marte'";
        
    //Metodo Consultar y conectar Marte
    public String[] conectarConsultarMarte(){
        
        //1.Crear array
        String[] datosMarte = new String[7] ; //creamos array donde se almacenan los datos obtenidos de MYSQL
        
        try{
        //2.Conectarme
        Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
        Statement statement = conexion.createStatement();
        
        //3.Lanzar consulta
        ResultSet resultados = statement.executeQuery(sqlMarte);
        
        //4.Recoger datos y guardar en array
        while (resultados.next()) {
            // Obtener los valores de las columnas
            datosMarte[0] = resultados.getString("nombre"); //Lo dejo todo string porque nos da el dato igualmente de MySQL
            datosMarte[1] = resultados.getString("radio_km");
            datosMarte[2]= resultados.getString("distancia_media_sol_mkm");
            datosMarte[3] = resultados.getString("periodo_orbital_dias");
            datosMarte[4]= resultados.getString("temperatura_media_c");
            datosMarte[5]= resultados.getString("tipo_planeta");
            datosMarte[6]= resultados.getString("num_satélites");
            datosMarte[7]= resultados.getString("nombre_estrella");
        }
        
        //5. Cerrar la conexion
        resultados.close();
        statement.close();
        conexion.close();
        
        } catch (SQLException e) {
        e.printStackTrace();
        }
        
        //6.Return array
        return datosMarte;
    }
}
