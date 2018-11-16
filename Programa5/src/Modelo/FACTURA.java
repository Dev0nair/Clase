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
public class FACTURA {
    private int COD;
    private int COD_SERVICIO;
    private int COD_CLIENTE;
    private float PRECIO;
    private String DESCRIPCION; // DESCRIPCION MAS DETALLADA DEL SERVICIO PRESTADO

    public FACTURA(int COD, int COD_SERVICIO, int COD_CLIENTE, float PRECIO, String DESCRIPCION) {
        this.COD = COD;
        this.COD_SERVICIO = COD_SERVICIO;
        this.COD_CLIENTE = COD_CLIENTE;
        this.PRECIO = PRECIO;
        this.DESCRIPCION = DESCRIPCION;
    }

    public FACTURA(){
        
    }
    
    public float getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(float PRECIO) {
        this.PRECIO = PRECIO;
    }
    
    public int getCOD() {
        return COD;
    }

    public void setCOD(int COD) {
        this.COD = COD;
    }

    public int getCOD_SERVICIO() {
        return COD_SERVICIO;
    }

    public void setCOD_SERVICIO(int COD_SERVICIO) {
        this.COD_SERVICIO = COD_SERVICIO;
    }

    public int getCOD_CLIENTE() {
        return COD_CLIENTE;
    }

    public void setCOD_CLIENTE(int COD_CLIENTE) {
        this.COD_CLIENTE = COD_CLIENTE;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }
    
    
}
