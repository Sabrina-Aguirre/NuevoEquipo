
package DAO;

import Conexion.Conexion;
import DTO.EquipoDTO;
import Model.Equipo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class EquipoDAOImple implements EquipoDAO{
    
    Conexion conex = new Conexion();

    @Override
    public List<Equipo> read() {

        List<Equipo> listaEquipos = new ArrayList();
        conex.AbrirConexion();
        try (Statement stmt = conex.getConnection().createStatement()) {
            
            try {
                ResultSet rs = stmt.executeQuery("SELECT *FROM equipo");
                while (rs.next()) {
                    Equipo equipo = new Equipo();
                    equipo.cuit= rs.getInt("cuit");
                    equipo.nombre = rs.getString("nombre");
                    equipo.division = rs.getString("division");
                    System.out.println("CUIT " + equipo.cuit+ " Nombre " + equipo.nombre + " Division " + equipo.division);
                    listaEquipos.add(equipo);//por cada pasada me carga un equipo a la lista
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
           //stmt.close();
            conex.getConnection().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaEquipos;
    }


    

    @Override
    public void insert(Equipo equipo) {
        try {
            conex.AbrirConexion();
            try (Statement stmt = conex.getConnection().createStatement()) {
                stmt.execute("INSERT INTO equipo (CUIT, nombre, division ) VALUES (" + equipo.getCuit() + ",'" + equipo.getNombre() + "','" + equipo.getDivision() + "')");

            } catch (Exception e) {
                e.printStackTrace();
            }
            conex.getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Equipo equipo) {
        try {
            conex.AbrirConexion();
            
            try (Statement stmt = conex.getConnection().createStatement()) {
                
                stmt.execute("UPDATE equipo SET cuit = "+ equipo.getCuit() + ", Nombre " + equipo.getNombre() + ", División '" + equipo.getDivision() +"'");

            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            conex.getConnection().close();
        } catch (Exception e) { 
            e.printStackTrace();
            return false;
        }
        return true;
    }


    @Override
    public boolean delete(int cuit) {
        conex.AbrirConexion();
        //try {
            
            
            try (Statement stmt = conex.getConnection().createStatement()) {
                
                stmt.execute("DELETE FROM equipo WHERE cuit = "+ cuit);

            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
            
       // } catch (Exception e) { 
           // e.printStackTrace();
           // return false;
        //}
        return true;
    }

    public void insert(EquipoDTO equipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
