
package DAO;

import Model.Equipo;
import java.util.List;


public interface EquipoDAO {
    
    public List<Equipo>read();
    public void insert (Equipo equipo);
    public boolean update (Equipo equipo);
    public boolean delete (int cuit);
}
