package Controlador;

import Modelo.CONSULTAS;
import Vista.LOGIN;
import Vista.PANTALLABASE;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 3268i
 */
public class Inicio {

    private static GestionarConexion Conexion;
    private static GestionarOperaciones Operacion;
    private static Errores Error;
    private static String USERNAME;
    private static String IMG;

    public static void main(String[] args) {
        inicializar();
        
        login();
    }
    
    public static void login(){
        if (realizarConexion()) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new LOGIN().setVisible(true);
                }
            });
        }
    }

    private static boolean realizarConexion() {
        Conexion = new GestionarConexion();

        int n = Conexion.realizarConexion();

        if (n == -1) {
            return true;
        } else {
            mostrarError(n);
            return false;
        }
    }

    public static boolean realizarLogin(String p) {
        int n = Conexion.realizarLogin(USERNAME, p);

        if (n == -1) {
            return true;
        } else {
            mostrarError(n);
            return false;
        }
    }

    public static void registrar(String msg, int type) {
        Error.registrar(msg, type);
    }

    public static void mostrarError(int n) {
        Error.getError(n);
    }

    private static void inicializar() {
        Error = new Errores();
    }
    
    public static void setUsuario(String user){
        USERNAME = user;
        Operacion = new GestionarOperaciones(Conexion.getConection(), new CONSULTAS(USERNAME).verB());
    }

    public static void cerrarConexion() {
        Conexion.cerrarConexion();
    }

    public static void AbrirPrograma() {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PANTALLABASE(USERNAME, IMG).setVisible(true);
            }
        });
    }
    
    public static Object realizarConsulta(String consulta, int tabla, boolean varios){
        Object obj = Operacion.consulta(consulta, tabla, varios);
        return obj;
    }

    public static void setIMG(String url) {
        IMG = url;
    }
    
    public static String getImg(){
        return IMG;
    }
    
    public static String getUser(){
        return USERNAME;
    }

}
