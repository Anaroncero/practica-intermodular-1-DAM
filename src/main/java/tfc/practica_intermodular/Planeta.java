/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tfc.practica_intermodular;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Planeta {
    /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta especificado.
     * 
     * @param nombrePlaneta Nombre del planeta a consultar.
     * @return Un array de Strings con los datos del planeta.
     */
    public String[] consultarPlaneta(String nombrePlaneta) {
        // Crear array para almacenar los datos
        String[] datosPlaneta = new String[8];

        try (Connection conexion = ConexionBDD.obtenerConexion();
             Statement statement = conexion.createStatement();) {
            // Lanzar consulta
            String sqlPlaneta = "SELECT * FROM planeta WHERE nombre='" + nombrePlaneta + "'";
            ResultSet resultados = statement.executeQuery(sqlPlaneta);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosPlaneta[0] = resultados.getString("radio_km");
                datosPlaneta[1] = resultados.getString("distancia_media_sol_mkm");
                datosPlaneta[2] = resultados.getString("periodo_orbital_dias");
                datosPlaneta[3] = resultados.getString("temperatura_media_c");
                datosPlaneta[4] = resultados.getString("tipo_planeta");
                datosPlaneta[5] = resultados.getString("num_satelites");
                datosPlaneta[6] = resultados.getString("Fecha_creacion");
                datosPlaneta[7] = resultados.getString("nombre");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosPlaneta;
    }
    
    
}
