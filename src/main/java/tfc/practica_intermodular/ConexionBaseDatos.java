/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tfc.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBaseDatos {
    String url = "jdbc:mysql://localhost:3306/practica_intermodularApr";
    String usuario = "root";
    String contraseña = "Med@c";
    
    //sentencias SQL
    String sqlMarte = "SELECT * FROM planeta where nombre = 'Marte'";
    
    public String[] conectarConsultarMarte() {
        // Crear array para almacenar los datos
        String[] datosMarte = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlMarte);

            // Recoger datos y guardar en el array
            if (resultados.next()) {
                datosMarte[0] = resultados.getString("radio_km");
                datosMarte[1] = resultados.getString("distancia_media_sol_mkm");
                datosMarte[2] = resultados.getString("periodo_orbital_dias");
                datosMarte[3] = resultados.getString("temperatura_media_c");
                datosMarte[4] = resultados.getString("tipo_planeta");
                datosMarte[5] = resultados.getString("num_satelites");
                datosMarte[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosMarte;
    }
}
