/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tfc.practica_intermodular;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Satelite {
    /**
     * Conecta a la base de datos y consulta la tabla 'satelite' para el satélite especificado.
     * 
     * @param nombreSatelite Nombre del satélite a consultar.
     * @return Un array de Strings con los datos del satélite.
     */
    public String[] consultarSatelite(String nombreSatelite) {
        // Crear array para almacenar los datos
        String[] datosSatelite = new String[7];

        try (Connection conexion = ConexionBDD.obtenerConexion();
             Statement statement = conexion.createStatement();) {
            // Lanzar consulta
            String sqlSatelite = "SELECT * FROM satelite WHERE nombre='" + nombreSatelite + "'";
            ResultSet resultados = statement.executeQuery(sqlSatelite);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosSatelite[0] = resultados.getString("nombre");
                datosSatelite[1] = resultados.getString("nombre_planeta");
                datosSatelite[2] = resultados.getString("radio_km");
                datosSatelite[3] = resultados.getString("distancia_media_planeta_km");
                datosSatelite[4] = resultados.getString("periodo_orbital_dias");
                datosSatelite[5] = resultados.getString("temperatura_media_c");
                datosSatelite[6] = resultados.getString("tipo_cuerpo");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosSatelite;
    }
}
