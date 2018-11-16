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
public class CLIENTE {
    private int COD;
    private String DNI;
    private String NOMBRE;
    private int TLF;

    public CLIENTE(int COD, String DNI, String NOMBRE, int TLF) {
        this.COD = COD;
        this.DNI = DNI;
        this.NOMBRE = NOMBRE;
        this.TLF = TLF;
    }

    public CLIENTE() {
        
    }

    public int getCOD() {
        return COD;
    }

    public void setCOD(int COD) {
        this.COD = COD;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public int getTLF() {
        return TLF;
    }

    public void setTLF(int TLF) {
        this.TLF = TLF;
    }
    
    
}
