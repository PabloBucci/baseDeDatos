/*
 * AdministradorDeConexiones.java
 *
 *
 */

package ar.com.educacionit.lab8.ejercicio1.administrador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
 */
public abstract class AdministradorDeConexiones {
    
    /**
     * Creates a new instance of AdministradorDeConexiones
     */
    public AdministradorDeConexiones() {
    }

    public static Connection getConnection() throws Exception
    {
     
        // Establece la conexion a utilizar contra la base de datos
        String dbConnString = "jdbc:mysql://localhost/j2se";
        
        // Establece el usuario de la base de datos
        String dbUser = "root";
        
        // Establece la contrase�a de la base de datos
        String dbPassword = "";
        
        // Retorna la conexion
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
    }    
    
    public static void main (String[] args) throws Exception{
        System.out.println(!getConnection().isClosed());
    }
}
