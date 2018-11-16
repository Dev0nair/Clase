/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Inicio;
import java.util.Collection;

/**
 *
 * @author 3268i
 */
public class CONSULTAS {
    private String user;
    public enum TABLAS{USUARIO, SERVICIO, FACTURA, CLIENTE};
    
    private String tablaa = "USUARIO";
    private String tablab = "SERVICIO";
    private String tablac = "FACTURA";
    private String tablad = "CLIENTE";
    
    public CONSULTAS(String user){
        this.user = user;
    }
    
    public String verIMGA(){
        return "SELECT IMG FROM " + tablaa + " WHERE USERNAME = '" + user + "'";
    }
    
    public String verA(){
        return "SELECT USERNAME FROM " + tablaa + " WHERE USERNAME = '" + user + "'";
    }
    
    public String verB(){ // CARGAR RESULTSET
        return "SELECT * FROM " + tablab + " WHERE USERNAME = '" + user + "'";
    }
    
    public String crearB(String descripcion){
        return "INSERT INTO " + tablab +
                " SELECT COUNT(COD)+1, '" + user + "', '" + descripcion + "' FROM "+ tablab;
    }
    
    public String verC(int servicio){
        return "SELECT * FROM " + tablac + " WHERE COD_SERVICIO = " + servicio + "";
    }
    
    public String verClienteDeFactura(int cod){
        return "SELECT * FROM CLIENTE WHERE COD = " + cod;
    }
    
    public String crearC(int codServicio, int codCliente, float precio, String descripcion){
        return "INSERT INTO " + tablac +
                " SELECT count(COD)+1, " + codServicio + "," + codCliente + "," + precio + ", '" + descripcion + "'" + " FROM " + tablac +
                " WHERE COD_SERVICIO = " + codServicio + " AND COD_CLIENTE = " + codCliente;
    }
    
    public String verD(){
        return "SELECT * FROM " + tablad;
    }
}

/*
INSERT INTO SERVICIOS
SELECT COUNT(COD), 'descripcion' FROM SERVICIOS WHERE USERNAME = 'user';

INSERT INTO REGISTROSERVICIO
SELECT count(COD), codServicio, codCliente, descripcion FROM REGISTROSERVICIO
WHERE COD_SERVICIO = codServicio AND COD_CLIENTE = codCliente;

*/