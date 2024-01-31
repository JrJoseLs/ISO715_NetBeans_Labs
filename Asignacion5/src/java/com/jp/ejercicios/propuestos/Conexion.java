package com.jp.ejercicios.propuestos;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    private static Connection cn = null;
    private static Driver driver = new org.apache.derby.jdbc.ClientDriver();
    private static String URLDerby = "jdbc:derby://localhost:1527/Asignacion5";
    private static String usuario = "root";
    private static String contrasena = "123199";

    public static Connection getConexion() throws SQLException {
        if (cn == null) {
            iniciarConexion();
        }
        return cn;
    }

    public static void iniciarConexion() throws SQLException {
        DriverManager.registerDriver(driver);
        cn = DriverManager.getConnection(URLDerby, usuario, contrasena);
    }

    public static ResultSet ejecutarConsulta(String sql) {
        ResultSet rs = null;
        try {
            Statement st = cn.createStatement();
            rs = st.executeQuery(sql);
        } catch (Throwable e) {
            System.out.println("Ha fallado la consulta de datos");
            e.printStackTrace();
        }
        return rs;
    }
  
    public static void ejecutarSentencia(String sql) {
        try {
            Statement st = cn.createStatement();
            st.executeUpdate(sql);
        } catch (Throwable e) {
            System.out.println("Ha fallado la sentencia de base de datos");
            e.printStackTrace();
        }
    }

    public void cerrarConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
