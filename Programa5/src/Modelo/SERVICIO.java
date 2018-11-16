/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumno
 */
public class SERVICIO {
    private int COD;
    private String USERNAME; // NOMBRE DEL USUARIO QUE REALIZA LA ACCIÓN
    private String DESCRIPCION; // DESCRIPCION DEL TIPO DE SERVICIO A REALIZAR

    public SERVICIO(int COD, String USERNAME, String DESCRIPCION) {
        this.COD = COD;
        this.USERNAME = USERNAME;
        this.DESCRIPCION = DESCRIPCION;
    }
    
    public SERVICIO(){
        
    }

    public int getCOD() {
        return COD;
    }

    public void setCOD(int COD) {
        this.COD = COD;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
    
}
