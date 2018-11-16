/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.util.HashMap;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author 3268i
 */
public class Errores {

    public enum listaErrores {
        NoDrivers, BadConection, BadUser, BadLogin, BadConsult, NoSalidas, BadAction
    };

    private HashMap lista;
    private Logger logger;

    Errores() {
        lista = new HashMap();

        configurarErrores();
        configurarFicheroLog();
    }

    private void configurarFicheroLog() {
        logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {

            fh = new FileHandler("Errores.log");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter); //aplicamos un formato para escribir los errores

        } catch (Exception e) {
            
        }
    }

    private void configurarErrores() {
        lista.put(0, "Drivers no instalados.");
        lista.put(1, "Error en la conexión.");
        lista.put(2, "El usuario no existe.");
        lista.put(3, "Contraseña incorrecta.");
        lista.put(4, "Ejecución de consulta fallida");
        lista.put(5, "No ha surgido efecto. 0 lineas devueltas.");
        lista.put(6, "Esta acción no se puede llevar a cabo.");
    }

    public void getError(int n) {
        String salida;

        salida = (String) lista.get(n);
        
        registrar(salida,0);
        
        JOptionPane.showMessageDialog(null, salida);
    }
    
    public void registrar(String mensaje, int type){
        try {
            switch(type){
                case 0:
                    logger.severe(mensaje);
                    break;
                default:
                    logger.info(mensaje);
                    break;
            }
        } catch (Exception e) {

        }
    }
}
