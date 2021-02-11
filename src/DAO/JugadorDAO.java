
package DAO;

import Model.Jugador;
import java.util.List;


public interface JugadorDAO {
    
    public List<Jugador>read();
    public void insert (Jugador jugador);
    public boolean update (Jugador jugador);
    public boolean delete (Integer dni);
}
