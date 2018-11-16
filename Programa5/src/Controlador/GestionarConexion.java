/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author 3268i
 */
public class GestionarConexion {
    private String urlClase = "jdbc:derby://localhost:1527/pc12";
    private String urlCasa = "jdbc:postgresql://localhost:5432/postgres";
    
    private String url = urlClase; // METODO PARA TENER EL APARTADO ARRIBA DEL TODO, Y NO TENER QUE IR A CAMBIAR EL CODIGO ABAJO 

    private String user = "pc12";
    private String pass = "pc12";
    
    private Connection con = null;

    GestionarConexion() {
        
    }

    public int realizarConexion() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Inicio.registrar("Drivers instalados", 1);
        } catch (Exception e) {
            return Errores.listaErrores.NoDrivers.ordinal();
        }

        try {
            con = DriverManager.getConnection(url, user, pass);
            Inicio.registrar("Conexion realizada.", 1);
        } catch (Exception e) {
            return Errores.listaErrores.BadConection.ordinal();
        }
        return -1;
    }
    
    public int realizarLogin(String user, String pass){
        int numSalidas = 0;
        
        String lec = "";
        try {
            lec = "SELECT COUNT(*) FROM USUARIO WHERE USERNAME = ? AND PASSWORD = ?";
            PreparedStatement stmt2 = con.prepareStatement(lec);
            
            stmt2.setString(1, user);
            stmt2.setString(2, pass);
            
            ResultSet rs = stmt2.executeQuery();
            
            rs.next();
            numSalidas = rs.getInt(1);
            rs.close();
            stmt2.close();
            
            if (numSalidas == 1) {
                Inicio.registrar("Loggeado como " + user, 1);
                return -1;
            } else {
                throw new Exception();
            }
            
        } catch (Exception e) {
            return Errores.listaErrores.BadLogin.ordinal();
        }
    }

    public void cerrarConexion() {
        try {
            con.close();
            Inicio.registrar("Conexion cerrada.", 1);
        } catch (Exception ex) {

        }
    }

    public Connection getConection() {
        return con;
    }
}
