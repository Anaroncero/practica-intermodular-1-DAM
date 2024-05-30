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
    
    
    //------------------------------------------Estrella
    
    String sqlEstrella = "SELECT * FROM Estrella";
    
    /**
     * Conecta a la base de datos y consulta la tabla 'Estrella'.
     * 
     * @return Un array de Strings con los datos de la estrella.
     */
    
    public String[] conectarConsultarEstrella() {
        // Crear array para almacenar los datos
        String[] datosEstrella = new String[6]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlEstrella);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosEstrella[0] = resultados.getString("nombre");
                datosEstrella[1] = resultados.getString("tipo");
                datosEstrella[2] = resultados.getString("radio_km");
                datosEstrella[3] = resultados.getString("temperatura_superficial_c");
                datosEstrella[4] = resultados.getString("distancia_media_tierra_mkm");
                datosEstrella[5] = resultados.getString("composicion");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosEstrella;
    }
    //------------------------------------------Marte
    //sentencias SQL
    String sqlMarte = "SELECT * FROM planeta where nombre='Marte'";
    
    /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta Marte.
     * 
     * @return Un array de Strings con los datos del planeta Marte.
     */
    
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
                datosMarte[6] = resultados.getString("Fecha_creacion");
                datosMarte[7] = resultados.getString("nombre");
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
    
    /**
     * Conecta a la base de datos y consulta la tabla 'Estrella'.
     * 
     * @return Un array de Strings con los datos de la estrella.
     */
    
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
                datosVenus[6] = resultados.getString("Fecha_creacion");
                datosVenus[7] = resultados.getString("nombre");
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
    
    /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta Tierra.
     * 
     * @return Un array de Strings con los datos del planeta Tierra.
     */
    
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
                datosTierra[6] = resultados.getString("Fecha_creacion");
                datosTierra[7] = resultados.getString("nombre");
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
    
    /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta Saturno.
     * 
     * @return Un array de Strings con los datos del planeta Saturno.
     */
    
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
                datosSaturno[6] = resultados.getString("Fecha_creacion");
                datosSaturno[7] = resultados.getString("nombre");
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
    String sqlJupiter = "SELECT * FROM planeta where nombre='Júpiter'";
    
    /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta Júpiter.
     * 
     * @return Un array de Strings con los datos del planeta Júpiter.
     */
    
    public String[] conectarConsultarJúpiter() {
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
                datosJupiter[6] = resultados.getString("Fecha_creacion");
                datosJupiter[7] = resultados.getString("nombre");
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
    
    /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta Urano.
     * 
     * @return Un array de Strings con los datos del planeta Urano.
     */
    
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
                datosUrano[6] = resultados.getString("Fecha_creacion");
                datosUrano[7] = resultados.getString("nombre");
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
    
     /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta Mercurio.
     * 
     * @return Un array de Strings con los datos del planeta Mercurio.
     */
    
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
                datosMercurio[6] = resultados.getString("Fecha_creacion");
                datosMercurio[7] = resultados.getString("nombre");
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
    
     /**
     * Conecta a la base de datos y consulta la tabla 'planeta' para el planeta Neptuno.
     * 
     * @return Un array de Strings con los datos del planeta Neptuno.
     */
    
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
                datosNeptuno[6] = resultados.getString("Fecha_creacion");
                datosNeptuno[7] = resultados.getString("nombre");
                
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
    
    //------------------------------------------Sátelite
    //--Luna
    
    String sqlLuna = "SELECT * FROM satelite where nombre='Luna'";
    
    /**
     * Consulta los datos del satélite Luna.
     * @return Un array de Strings con los datos del satélite Luna.
     */
    
    public String[] conectarConsultarLuna() {
        // Crear array para almacenar los datos
        String[] datosLuna = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlLuna);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosLuna[0] = resultados.getString("nombre");
                datosLuna[1] = resultados.getString("nombre_planeta");
                datosLuna[2] = resultados.getString("radio_km");
                datosLuna[3] = resultados.getString("distancia_media_planeta_km");
                datosLuna[4] = resultados.getString("periodo_orbital_dias");
                datosLuna[5] = resultados.getString("temperatura_media_c");
                datosLuna[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosLuna;
    }
    
    //--Fobos
    
    String sqlFobos = "SELECT * FROM satelite where nombre='Fobos'";
    
    /**
     * Consulta los datos del satélite Fobos.
     * @return Un array de Strings con los datos del satélite Fobos.
     */
    
    public String[] conectarConsultarFobos() {
        // Crear array para almacenar los datos
        String[] datosFobos = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlFobos);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosFobos[0] = resultados.getString("nombre");
                datosFobos[1] = resultados.getString("nombre_planeta");
                datosFobos[2] = resultados.getString("radio_km");
                datosFobos[3] = resultados.getString("distancia_media_planeta_km");
                datosFobos[4] = resultados.getString("periodo_orbital_dias");
                datosFobos[5] = resultados.getString("temperatura_media_c");
                datosFobos[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosFobos;
    }
    
    //--Deimos
    
    String sqlDeimos = "SELECT * FROM satelite where nombre='Deimos'";
    
    /**
     * Consulta los datos del satélite Deimos.
     * @return Un array de Strings con los datos del satélite Deimos.
     */
    
    
    public String[] conectarConsultarDeimos() {
        // Crear array para almacenar los datos
        String[] datosDeimos = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlDeimos);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosDeimos[0] = resultados.getString("nombre");
                datosDeimos[1] = resultados.getString("nombre_planeta");
                datosDeimos[2] = resultados.getString("radio_km");
                datosDeimos[3] = resultados.getString("distancia_media_planeta_km");
                datosDeimos[4] = resultados.getString("periodo_orbital_dias");
                datosDeimos[5] = resultados.getString("temperatura_media_c");
                datosDeimos[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosDeimos;
    }
    
    //--Ío
    
    String sqlÍo = "SELECT * FROM satelite where nombre='Ío'";
    
    /**
     * Consulta los datos del satélite Ío.
     * @return Un array de Strings con los datos del satélite Ío.
     */
    
    public String[] conectarConsultarÍo() {
        // Crear array para almacenar los datos
        String[] datosÍo = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlÍo);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosÍo[0] = resultados.getString("nombre");
                datosÍo[1] = resultados.getString("nombre_planeta");
                datosÍo[2] = resultados.getString("radio_km");
                datosÍo[3] = resultados.getString("distancia_media_planeta_km");
                datosÍo[4] = resultados.getString("periodo_orbital_dias");
                datosÍo[5] = resultados.getString("temperatura_media_c");
                datosÍo[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosÍo;
    }
    
    //--Europa
    
    String sqlEuropa = "SELECT * FROM satelite where nombre='Europa'";
    
     /**
     * Consulta los datos del satélite Europa.
     * @return Un array de Strings con los datos del satélite Europa.
     */
    
    public String[] conectarConsultarEuropa() {
        // Crear array para almacenar los datos
        String[] datosEuropa = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlEuropa);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosEuropa[0] = resultados.getString("nombre");
                datosEuropa[1] = resultados.getString("nombre_planeta");
                datosEuropa[2] = resultados.getString("radio_km");
                datosEuropa[3] = resultados.getString("distancia_media_planeta_km");
                datosEuropa[4] = resultados.getString("periodo_orbital_dias");
                datosEuropa[5] = resultados.getString("temperatura_media_c");
                datosEuropa[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosEuropa;
    }
    
    //--Ganimedes
    
    String sqlGanimedes = "SELECT * FROM satelite where nombre='Ganimedes'";
    
    /**
     * Consulta los datos del satélite Ganimedes.
     * @return Un array de Strings con los datos del satélite Ganimedes.
     */
    
    public String[] conectarConsultarGanimedes() {
        // Crear array para almacenar los datos
        String[] datosGanimedes = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlGanimedes);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosGanimedes[0] = resultados.getString("nombre");
                datosGanimedes[1] = resultados.getString("nombre_planeta");
                datosGanimedes[2] = resultados.getString("radio_km");
                datosGanimedes[3] = resultados.getString("distancia_media_planeta_km");
                datosGanimedes[4] = resultados.getString("periodo_orbital_dias");
                datosGanimedes[5] = resultados.getString("temperatura_media_c");
                datosGanimedes[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosGanimedes;
    }
    
    //--Calisto
    
    String sqlCalisto = "SELECT * FROM satelite where nombre='Calisto'";
    
    /**
     * Consulta los datos del satélite Calisto.
     * @return Un array de Strings con los datos del satélite Calisto.
     */
    
    public String[] conectarConsultarCalisto() {
        // Crear array para almacenar los datos
        String[] datosCalisto = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlCalisto);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosCalisto[0] = resultados.getString("nombre");
                datosCalisto[1] = resultados.getString("nombre_planeta");
                datosCalisto[2] = resultados.getString("radio_km");
                datosCalisto[3] = resultados.getString("distancia_media_planeta_km");
                datosCalisto[4] = resultados.getString("periodo_orbital_dias");
                datosCalisto[5] = resultados.getString("temperatura_media_c");
                datosCalisto[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosCalisto;
    }
    
    //--Titán
    
    String sqlTitán = "SELECT * FROM satelite where nombre='Titán'";
    
     /**
     * Consulta los datos del satélite Titán.
     * @return Un array de Strings con los datos del satélite Titán.
     */
    
    public String[] conectarConsultarTitán() {
        // Crear array para almacenar los datos
        String[] datosTitan = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlTitán);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosTitan[0] = resultados.getString("nombre");
                datosTitan[1] = resultados.getString("nombre_planeta");
                datosTitan[2] = resultados.getString("radio_km");
                datosTitan[3] = resultados.getString("distancia_media_planeta_km");
                datosTitan[4] = resultados.getString("periodo_orbital_dias");
                datosTitan[5] = resultados.getString("temperatura_media_c");
                datosTitan[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosTitan;
    }
    
    //--Encélado
    
    String sqlEncélado = "SELECT * FROM satelite where nombre='Encélado'";
    
     /**
     * Consulta los datos del satélite Encélado.
     * @return Un array de Strings con los datos del satélite Encélado.
     */
    
    public String[] conectarConsultarEncélado() {
        // Crear array para almacenar los datos
        String[] datosEncélado = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlEncélado);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosEncélado[0] = resultados.getString("nombre");
                datosEncélado[1] = resultados.getString("nombre_planeta");
                datosEncélado[2] = resultados.getString("radio_km");
                datosEncélado[3] = resultados.getString("distancia_media_planeta_km");
                datosEncélado[4] = resultados.getString("periodo_orbital_dias");
                datosEncélado[5] = resultados.getString("temperatura_media_c");
                datosEncélado[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosEncélado;
    }
    
    //--Titania
    
    String sqlTitania = "SELECT * FROM satelite where nombre='Titania'";
    
    /**
     * Consulta los datos del satélite Titania.
     * @return Un array de Strings con los datos del satélite Titania.
     */
    
    public String[] conectarConsultarTitania() {
        // Crear array para almacenar los datos
        String[] datosTitania = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlTitania);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosTitania[0] = resultados.getString("nombre");
                datosTitania[1] = resultados.getString("nombre_planeta");
                datosTitania[2] = resultados.getString("radio_km");
                datosTitania[3] = resultados.getString("distancia_media_planeta_km");
                datosTitania[4] = resultados.getString("periodo_orbital_dias");
                datosTitania[5] = resultados.getString("temperatura_media_c");
                datosTitania[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosTitania;
    }
    
    //--Oberón
    
    String sqlOberón = "SELECT * FROM satelite where nombre='Oberón'";
    
    /**
     * Consulta los datos del satélite Oberón.
     * @return Un array de Strings con los datos del satélite Oberón.
     */
    
    public String[] conectarConsultarOberón() {
        // Crear array para almacenar los datos
        String[] datosOberón = new String[7]; 

        try {
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            Statement statement = conexion.createStatement();

            // Lanzar consulta
            ResultSet resultados = statement.executeQuery(sqlOberón);

            // Recoger datos y guardar en el array
            while (resultados.next()) {
                datosOberón[0] = resultados.getString("nombre");
                datosOberón[1] = resultados.getString("nombre_planeta");
                datosOberón[2] = resultados.getString("radio_km");
                datosOberón[3] = resultados.getString("distancia_media_planeta_km");
                datosOberón[4] = resultados.getString("periodo_orbital_dias");
                datosOberón[5] = resultados.getString("temperatura_media_c");
                datosOberón[6] = resultados.getString("tipo_cuerpo");
                
            }

            // Cerrar la conexión
            resultados.close();
            statement.close();
            conexion.close();
            
        
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Devolver el array
        return datosOberón;
    }
    
}
