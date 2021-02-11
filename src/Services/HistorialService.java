
package Services;

import DTO.HistorialDTO;
import Model.Historial;
import java.util.List;


public interface HistorialService {
    
    public List<HistorialDTO>read();
    public void insert (HistorialDTO hdto);
    public boolean update (HistorialDTO hdto);
    public boolean delete (Integer id_historial);
    
}
