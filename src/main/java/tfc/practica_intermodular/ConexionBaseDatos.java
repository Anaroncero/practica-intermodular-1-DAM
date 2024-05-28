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
    String url = "jdbc:mysql://localhost:3306/practica_intermodular";
    String usuario = "root";
    String contraseña = "Med@c";
    
    //------------------------------------------Marte
    //sentencias SQL
    String sqlMarte = "SELECT * FROM planeta where nombre='Marte'";
    
    public String[] conectarConsultarMarte() {
        // Crear array para almacenar los datos
        String[] datosMarte = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlMarte);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
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
    
    //------------------------------------------Venus
    
    String sqlVenus = "SELECT * FROM planeta where nombre='Venus'";
    
    public String[] conectarConsultarVenus() {
        // Crear array para almacenar los datos
        String[] datosVenus = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlVenus);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosVenus[0] = resultados.getString("radio_km");
                datosVenus[1] = resultados.getString("distancia_media_sol_mkm");
                datosVenus[2] = resultados.getString("periodo_orbital_dias");
                datosVenus[3] = resultados.getString("temperatura_media_c");
                datosVenus[4] = resultados.getString("tipo_planeta");
                datosVenus[5] = resultados.getString("num_satelites");
                datosVenus[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosVenus;
    }
    
    //------------------------------------------Tierra
    String sqlTierra = "SELECT * FROM planeta where nombre='Tierra'";
    
    public String[] conectarConsultarTierra() {
        // Crear array para almacenar los datos
        String[] datosTierra = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlTierra);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosTierra[0] = resultados.getString("radio_km");
                datosTierra[1] = resultados.getString("distancia_media_sol_mkm");
                datosTierra[2] = resultados.getString("periodo_orbital_dias");
                datosTierra[3] = resultados.getString("temperatura_media_c");
                datosTierra[4] = resultados.getString("tipo_planeta");
                datosTierra[5] = resultados.getString("num_satelites");
                datosTierra[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosTierra;
    }
    //------------------------------------------Saturno
    String sqlSaturno = "SELECT * FROM planeta where nombre='Saturno'";
    
    public String[] conectarConsultarSaturno() {
        // Crear array para almacenar los datos
        String[] datosSaturno = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlSaturno);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosSaturno[0] = resultados.getString("radio_km");
                datosSaturno[1] = resultados.getString("distancia_media_sol_mkm");
                datosSaturno[2] = resultados.getString("periodo_orbital_dias");
                datosSaturno[3] = resultados.getString("temperatura_media_c");
                datosSaturno[4] = resultados.getString("tipo_planeta");
                datosSaturno[5] = resultados.getString("num_satelites");
                datosSaturno[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosSaturno;
    }
    
    //------------------------------------------Jupiter
    String sqlJupiter = "SELECT * FROM planeta where nombre='Jupiter'";
    
    public String[] conectarConsultarJupiter() {
        // Crear array para almacenar los datos
        String[] datosJupiter = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlJupiter);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosJupiter[0] = resultados.getString("radio_km");
                datosJupiter[1] = resultados.getString("distancia_media_sol_mkm");
                datosJupiter[2] = resultados.getString("periodo_orbital_dias");
                datosJupiter[3] = resultados.getString("temperatura_media_c");
                datosJupiter[4] = resultados.getString("tipo_planeta");
                datosJupiter[5] = resultados.getString("num_satelites");
                datosJupiter[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosJupiter;
    }
    //------------------------------------------Urano
    String sqlUrano = "SELECT * FROM planeta where nombre='Urano'";
    
    public String[] conectarConsultarUrano() {
        // Crear array para almacenar los datos
        String[] datosUrano = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlUrano);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosUrano[0] = resultados.getString("radio_km");
                datosUrano[1] = resultados.getString("distancia_media_sol_mkm");
                datosUrano[2] = resultados.getString("periodo_orbital_dias");
                datosUrano[3] = resultados.getString("temperatura_media_c");
                datosUrano[4] = resultados.getString("tipo_planeta");
                datosUrano[5] = resultados.getString("num_satelites");
                datosUrano[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosUrano;
    }
    //------------------------------------------Mercurio
    String sqlMercurio = "SELECT * FROM planeta where nombre='Mercurio'";
    
    public String[] conectarConsultarMercurio() {
        // Crear array para almacenar los datos
        String[] datosMercurio = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlMercurio);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosMercurio[0] = resultados.getString("radio_km");
                datosMercurio[1] = resultados.getString("distancia_media_sol_mkm");
                datosMercurio[2] = resultados.getString("periodo_orbital_dias");
                datosMercurio[3] = resultados.getString("temperatura_media_c");
                datosMercurio[4] = resultados.getString("tipo_planeta");
                datosMercurio[5] = resultados.getString("num_satelites");
                datosMercurio[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosMercurio;
    }
    //------------------------------------------Neptuno
    String sqlNeptuno = "SELECT * FROM planeta where nombre='Neptuno'";
    
    public String[] conectarConsultarNeptuno() {
        // Crear array para almacenar los datos
        String[] datosNeptuno = new String[8]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlNeptuno);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosNeptuno[0] = resultados.getString("radio_km");
                datosNeptuno[1] = resultados.getString("distancia_media_sol_mkm");
                datosNeptuno[2] = resultados.getString("periodo_orbital_dias");
                datosNeptuno[3] = resultados.getString("temperatura_media_c");
                datosNeptuno[4] = resultados.getString("tipo_planeta");
                datosNeptuno[5] = resultados.getString("num_satelites");
                datosNeptuno[6] = resultados.getString("nombre_estrella");
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosNeptuno;
    }
}
