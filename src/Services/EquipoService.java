
package Services;

import DTO.EquipoDTO;
import Model.Equipo;
import java.util.List;


public interface EquipoService {
    
    public List<EquipoDTO>read();
    public void insert(EquipoDTO eDto);
    public boolean update(EquipoDTO eDto);
    public boolean delete(int cuit);
    
}
