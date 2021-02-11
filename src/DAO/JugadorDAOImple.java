
package DAO;

import Conexion.Conexion;
import Model.Jugador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class JugadorDAOImple implements JugadorDAO{

    Conexion conex = new Conexion();
    
    @Override
    public List<Jugador> read() {
        List<Jugador> listaJugadores = new ArrayList();
        conex.AbrirConexion();
        try (Statement stmt = conex.getConnection().createStatement()) {
            
            try {
                ResultSet rs = stmt.executeQuery("SELECT *FROM jugador");
                while (rs.next()) {
                    Jugador jugador = new Jugador();
                    jugador.dni= rs.getInt("dni");
                    jugador.nombre = rs.getString("nombre");
                    System.out.println("Dni " + jugador.dni+ " Nombre " + jugador.nombre);
                    listaJugadores.add(jugador);//por cada pasada me carga un equipo a la lista
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
           //stmt.close();
            conex.getConnection().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaJugadores;
    }

    @Override
    public void insert(Jugador jugador) {
        try {
            conex.AbrirConexion();
            try (Statement stmt = conex.getConnection().createStatement()) {
                stmt.execute("INSERT INTO jugador (dni, nombre) VALUES (" + jugador.getDni() + ",'" + jugador.getNombre() + "')");

            } catch (Exception e) {
                e.printStackTrace();
            }
            conex.getConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean update(Jugador jugador) {
         try {
            conex.AbrirConexion();
            
            try (Statement stmt = conex.getConnection().createStatement()) {
                
                stmt.execute("UPDATE jugador SET DNI = "+ jugador.getDni() + ", Nombre " + jugador.getNombre() + ", Jugador '" + "'+'");

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
    public boolean delete(Integer dni) {
        try {
            conex.AbrirConexion();
            
            try (Statement stmt = conex.getConnection().createStatement()) {
                
                stmt.execute("DELETE FROM jugador WHERE DNI = "+ dni);

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
