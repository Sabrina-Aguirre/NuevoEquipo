
package DAO;

import Model.Historial;
import java.util.List;


public interface HistorialDAO {
    
    public List<Historial>read();
    public void insert (Historial historial);
    public boolean update (Historial historial);
    public boolean delete (Integer id_historial);
}
