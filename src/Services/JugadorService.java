
package Services;

import DTO.JugadorDTO;
import Model.Jugador;
import java.util.List;


public interface JugadorService {
    
    public List<JugadorDTO>read();
    public void insert (JugadorDTO jdto);
    public boolean update (JugadorDTO jdto);
    public boolean delete (Integer dni);
}
