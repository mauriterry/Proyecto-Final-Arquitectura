/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucatolica.DAOs;

import co.edu.ucatolica.DTOs.Beneficiario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmpleadoDAO {

    public boolean crearBeneficiario(Beneficiario p, Connection con) {
        PreparedStatement pstmt = null;
        boolean respuesta = false;
        try {
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando crearBeneficiario...");
            pstmt = con.prepareStatement("INSERT INTO beneficiario VALUES (?,?,?,?,?,?,?,?,?,?,?)");

            /*pstmt.setInt(1, p.getId());
            pstmt.setString(2, p.getIdentificacion());
            pstmt.setString(3, p.getNombre1());
            pstmt.setString(4, p.getNombre2());
            pstmt.setString(5, p.getApellido1());
            pstmt.setString(6, p.getApellido2());
            pstmt.setString(7, p.getGenero());
            pstmt.setString(8, p.getTelef());
            pstmt.setString(9, p.getEmail());
            pstmt.setString(10, p.getfNacimiento());
            pstmt.setString(11, p.getTipoP());

            pstmt.execute();

            con.close();

            respuesta = true;
            */
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return respuesta;

    }

    public ArrayList<Beneficiario> consultarBeneficiario(Beneficiario p, Connection con) {

        ArrayList<Beneficiario> datos = new ArrayList<Beneficiario>();

        Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando consultarBeneficiario...");
        
        /*
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select identificacion, nombre_1,nombre_2, "
                    + " apellido_1, apellido_2, genero, telefono, email, "
                    + " fecha_nacimiento, tipo_beneficiario, id_beneficiario "
                    + " from beneficiario "
                    + " where "
                    + " identificacion='" + p.getIdentificacion() + "'"
                    + " AND nombre_1='" + p.getNombre1() + "'");
         
            while (rs.next()) {
                beneficiario per = new beneficiario();
                per.setIdentificacion(rs.getString(1));
                per.setNombre1(rs.getString(2));
                per.setNombre2(rs.getString(3));
                per.setApellido1(rs.getString(4));
                per.setApellido2(rs.getString(5));
                per.setGenero(rs.getString(6));
                per.setTelef(rs.getString(7));
                per.setEmail(rs.getString(8));
                per.setfNacimiento(rs.getString(9));
                per.setTipoP(rs.getString(10));
                per.setId(rs.getInt(11));

                datos.add(per);
                
            }
        
            */    
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando consultarBeneficiario fin..." + datos.size());
            
            /*
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        return datos;
        
    }

    public int obtenerId(Connection con) {
        int id = -1;
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select max(id_beneficiario)+1 from beneficiario");

            while (rs.next()) {
                id = rs.getInt(1);
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return id;
    }

    public boolean editarBeneficiario(Beneficiario p, Connection con) {
        PreparedStatement pstmt = null;
        boolean respuesta = false;
        /*
        try {

            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando editarBeneficiario...");

            pstmt = con.prepareStatement("UPDATE beneficiario "
                    + " SET "
                    + " identificacion=?"
                    + " , nombre_1=?"
                    + " , nombre_2=?"
                    + " , apellido_1=?"
                    + " , apellido_2=?"
                    + " , genero=?"
                    + " , telefono=?"
                    + " , email=?"
                    + " , fecha_nacimiento=?"
                    + " , tipo_beneficiario=?"
                    + " where id_beneficiario=?");

            pstmt.setString(1, p.getIdentificacion());
            pstmt.setString(2, p.getNombre1());
            pstmt.setString(3, p.getNombre2());
            pstmt.setString(4, p.getApellido1());
            pstmt.setString(5, p.getApellido2());
            pstmt.setString(6, p.getGenero());
            pstmt.setString(7, p.getTelef());
            pstmt.setString(8, p.getEmail());
            pstmt.setString(9, p.getfNacimiento());
            pstmt.setString(10, p.getTipoP());
            pstmt.setInt(11, p.getId());

            pstmt.executeUpdate();

            con.close();

            respuesta = true;
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        return respuesta;

    }

    public ArrayList<Beneficiario> consultarBeneficiario1(Connection con) {

        ArrayList<Beneficiario> datos = new ArrayList<Beneficiario>();

        Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando consultarBeneficiario...");
        /*
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select identificacion, nombre_1,nombre_2, "
                    + " apellido_1, apellido_2, genero, telefono, email, "
                    + " fecha_nacimiento, tipo_beneficiario, id_beneficiario "
                    + " from beneficiario ");

            while (rs.next()) {
                beneficiario per = new beneficiario();
                per.setIdentificacion(rs.getString(1));
                per.setNombre1(rs.getString(2));
                per.setNombre2(rs.getString(3));
                per.setApellido1(rs.getString(4));
                per.setApellido2(rs.getString(5));
                per.setGenero(rs.getString(6));
                per.setTelef(rs.getString(7));
                per.setEmail(rs.getString(8));
                per.setfNacimiento(rs.getString(9));
                per.setTipoP(rs.getString(10));
                per.setId(rs.getInt(11));

                datos.add(per);

            }

            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.INFO, "Ejecutando consultarBeneficiario fin..." + datos.size());

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        return datos;
    }

    public int obtenerIdCliente(String ident, Connection con) {

        int id = -1;
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery("select id_beneficiario from beneficiario where identificacion='" + ident + "';");

            while (rs.next()) {
                id = rs.getInt(1);
            }

            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BeneficiarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(id);
        return id;
    }

}

