/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    
     // configuración local MySQL (puerto  3306)
    private static final String URL = "jdbc:mysql://localhost:3306/excusa_entrega";
    private static final String USER = "root";
    private static final String PASSWORD = ""; 

 	// devuelve un objeto conexion
    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
