/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CLIENTE;
import Modelo.FACTURA;
import Modelo.SERVICIO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 3268i
 */
public class GestionarOperaciones {

    Connection con;

    PreparedStatement stmt;
    ResultSet rs; // PUNTERO QUE PASARÁ DE UNA TUPLA A OTRA DE LA TABLA B

    GestionarOperaciones(Connection conn, String consulta) {
        this.con = conn;
        try {
            stmt = con.prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stmt.executeQuery();
            rs.next(); // LO HACEMOS PARA PONER EL PUNTERO AL PRIMERO
        } catch (SQLException ex) {
            Inicio.mostrarError(Errores.listaErrores.BadConection.ordinal());
        }
    }

    public boolean Avanzar() {
        try {
            if (!rs.isLast()) {
                rs.next();
                rs.updateRow();
                Inicio.registrar("Puntero a siguiente registro de B.", 1);
            }
            return true;
        } catch (SQLException ex) {
            Inicio.mostrarError(Errores.listaErrores.BadAction.ordinal());
            return false;
        }
    }

    public boolean Retroceder() {
        try {
            if (!rs.isFirst()) {
                rs.previous();
                rs.updateRow();
                Inicio.registrar("Puntero a anterior registro de B.", 1);
            }
            return true;
        } catch (SQLException ex) {
            Inicio.mostrarError(Errores.listaErrores.BadAction.ordinal());
            return false;
        }
    }

    public void Actualizar(SERVICIO obj) {
        try {
            actualizar(obj);
        } catch (Exception e) {

        }
    }

    private void actualizar(SERVICIO obj) {
        try {
            obj.setCOD(rs.getInt(1));
            obj.setUSERNAME(rs.getString(2));
            obj.setDESCRIPCION(rs.getString(3));

            Inicio.registrar("Registro de tabla B leido.", 1);
        } catch (SQLException ex) {

        }

    }

    Object consulta(String consulta, int tabla, boolean varios) {
        Object aux = null;
        switch (tabla) {
            case 0:
                aux = consultaTablaA(consulta);
                break;
            case 1:
                aux = consultaTablaB(consulta, varios);
                break;
            case 2:
                aux = consultaTablaC(consulta, varios);
                break;
            case 3:
                aux = consultaTablaD(consulta, varios);
                break;
        }
        return aux;
    }

    private Object consultaTablaC(String consulta, boolean varios) {
        if (varios) {

            LinkedList<FACTURA> lista = new LinkedList();
            try {
                Statement stmt2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs2 = stmt2.executeQuery(consulta);

                while (rs2.next()) {
                    lista.add(new FACTURA(rs2.getInt(1), rs2.getInt(2), rs2.getInt(3), rs2.getFloat(4), rs2.getString(5)));
                }

                stmt2.close();
                rs2.close();

                Inicio.registrar("Se ha realizado la consulta: " + consulta + ".", 1);
            } catch (Exception e) {
                Inicio.mostrarError(Errores.listaErrores.BadConsult.ordinal());
            }
            return lista;
        } else {
            return consultaModificacion(consulta);
        }
    }

    private Object consultaTablaA(String consulta) {
        String url = null;
        try {
            Statement stmt2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery(consulta);

            while (rs2.next()) {
                url = rs2.getString(1);
                break;
            }

            stmt2.close();
            rs2.close();

            Inicio.registrar("Se ha realizado la consulta: " + consulta + ".", 1);
        } catch (Exception e) {
            Inicio.mostrarError(Errores.listaErrores.BadConsult.ordinal());
        }
        return (Object) url;
    }

    private Object consultaTablaB(String consulta, boolean varios) {
        SERVICIO aux = new SERVICIO();;
        if (varios) {
            return null;
        } else { // si varios es falso, significa que solo queremos 1
            if (consulta == null) { // si la consulta es null, es decir, no hay consulta, es que simplemente queremos el actual    
                actualizar(aux);
            } else if (consulta.compareToIgnoreCase("prev") == 0 || consulta.compareToIgnoreCase("next") == 0) {
                if (consulta.compareToIgnoreCase("prev") == 0) {
                    Retroceder();
                } else {
                    Avanzar();
                }

                Actualizar(aux);

            } else { // si queremos otra consulta en especial que nos devuelva solo 1 servicio
                return consultaModificacion(consulta);
            }
        }
        return aux;

    }

    private int consultaModificacion(String consulta) {
        int numlineas = 0;
        try {
            PreparedStatement stmt2 = con.prepareStatement(consulta, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            numlineas = stmt2.executeUpdate();

            stmt2.close();
        } catch (SQLException ex) {
            Inicio.mostrarError(Errores.listaErrores.BadConsult.ordinal());
        }
        return numlineas;
    }

    private Object consultaTablaD(String consulta, boolean varios) {
        CLIENTE cli = new CLIENTE();
        if (varios) { // SI ES VARIOS, ES QUE QUEREMOS TODOS, SINO, SOLAMENTE QUEREMOS 1 EN CONCRETO

        } else {
            cli = recogerUnaD(consulta);
            return cli;
        }

        return null;
    }

    private CLIENTE recogerUnaD(String consulta) {
        CLIENTE cli = null;
        try {
            Statement stmt2 = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery(consulta);

            while (rs2.next()) {
                cli = new CLIENTE(rs2.getInt(1), rs2.getString(2), rs2.getString(3), rs2.getInt(4));
            }

            stmt2.close();
            rs2.close();

            Inicio.registrar("Se ha realizado la consulta: " + consulta + ".", 1);
        } catch (Exception e) {
            Inicio.mostrarError(Errores.listaErrores.BadConsult.ordinal());
        }

        return cli;
    }

}
