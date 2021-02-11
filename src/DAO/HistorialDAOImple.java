
package DAO;

import Conexion.Conexion;
import Model.Historial;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class HistorialDAOImple implements HistorialDAO{

    Conexion conex = new Conexion();

    @Override
    public List<Historial> read() {
        List<Historial> listaHistoriales = new ArrayList();
        conex.AbrirConexion();
        try (Statement stmt = conex.getConnection().createStatement()) {
            
            try {
                ResultSet rs = stmt.executeQuery("SELECT *FROM historial");
                while (rs.next()) {
                    Historial h = new Historial();
                    h.id_historial = rs.getInt("id_historial");
                    h.id_equipo= rs.getInt("id_equipo");
                    h.id_jugador= rs.getInt("id_jugador");
                    h.fecha_in = rs.getDate("fecha_in").toLocalDate();
                    h.fecha_fin = rs.getDate("fecha_fin").toLocalDate();
                    h.posicion = rs.getString("posicion");
                    System.out.println("ID Historial" + h.id_historial + "ID Equipo " + h.id_equipo+ " ID Jugador " + h.id_jugador + " Fecha de Inicio " + h.fecha_in + " Fecha de fin  " + h.fecha_fin + " posición " + h.posicion);
                    listaHistoriales.add(h);//por cada pasada me carga un equipo a la lista
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
           //stmt.close();
            conex.getConnection().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaHistoriales;
    }

    @Override
    public void insert(Historial historial) {
        try {
            conex.AbrirConexion();
            
            try (Statement stmt = conex.getConnection().createStatement()) {
                
                stmt.execute("INSERT INTO historial (id_historial, id_equipo, id_jugador, fecha_in , fecha_fin, posicion) VALUES (" + historial.getId_historial() + "," + historial.getId_equipo() + ",'" + historial.getId_jugador() +"','" + historial.getFecha_in()+"','" + historial.getFecha_fin() +"','" + historial.getPosicion() +"')");

            } catch (Exception e) {
                e.printStackTrace();
            }
            conex.getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public boolean update(Historial historial) {
        try {
            conex.AbrirConexion();
            
            try (Statement stmt = conex.getConnection().createStatement()) {
                
                stmt.execute("UPDATE historial SET id_historial = "+ historial.getId_historial() + ", Equipo " + historial.getId_equipo() + ", Jugador '" + historial.getId_jugador() +"', Fecha de inicio '" + historial.getFecha_in()+"', Fecha de Salida '" + historial.getFecha_fin() +"', Posición '" + historial.getPosicion() +"')");

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
    public boolean delete(Integer id_historial) {
        try {
            conex.AbrirConexion();
            
            try (Statement stmt = conex.getConnection().createStatement()) {
                
                stmt.execute("DELETE FROM historial WHERE id_historial = "+ id_historial);

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

   


    }
    

   
    

