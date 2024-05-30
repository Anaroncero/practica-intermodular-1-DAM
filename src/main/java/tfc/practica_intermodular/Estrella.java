/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tfc.practica_intermodular;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ana
 */
public class Estrella {
    public String[] consultarEstrella() {
        // Array para almacenar los datos
        String[] datosEstrella = new String[6];

        try (Connection conexion = ConexionBDD.obtenerConexion();
             Statement statement = conexion.createStatement();) {
            // Lanzamos la consulta
            String sqlEstrella = "SELECT * FROM Estrella";
            ResultSet resultados = statement.executeQuery(sqlEstrella);

            // Recogemos datos y guardamos en el array
            while (resultados.next()) {
                datosEstrella[0] = resultados.getString("nombre");
                datosEstrella[1] = resultados.getString("tipo");
                datosEstrella[2] = resultados.getString("radio_km");
                datosEstrella[3] = resultados.getString("temperatura_superficial_c");
                datosEstrella[4] = resultados.getString("distancia_media_tierra_mkm");
                datosEstrella[5] = resultados.getString("composicion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosEstrella;
    }
}

