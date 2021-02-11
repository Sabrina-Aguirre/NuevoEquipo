
package Services;

import DAO.HistorialDAOImple;
import DTO.HistorialDTO;
import Model.Historial;
import java.util.ArrayList;
import java.util.List;

public class HistorialServicesImple implements HistorialService{

    HistorialDAOImple hdao = new HistorialDAOImple();
    
    
    public HistorialDTO pasarHistorialAdto(Historial h){
        
        HistorialDTO historialDto = new HistorialDTO();
        
        historialDto.setId_historial(h.getId_historial());
        historialDto.setId_equipo(h.getId_equipo());
        historialDto.setId_jugador(h.getId_jugador());
        historialDto.setFecha_in(h.getFecha_in());
        historialDto.setFecha_fin(h.getFecha_fin());
        historialDto.setPosicion(h.getPosicion());
        return historialDto;
    }
    public Historial pasarDtoAHistorial(HistorialDTO dtoe){
        Historial h = new Historial();
        h.setId_historial(h.getId_historial());
        h.setId_equipo(h.getId_equipo());
        h.setId_jugador(h.getId_jugador());
        h.setFecha_in(h.getFecha_in());
        h.setFecha_fin(h.getFecha_fin());
        h.setPosicion(h.getPosicion());
        return h;
    }
    
    @Override
    public void insert(HistorialDTO hdto) {
        hdao.insert(pasarDtoAHistorial(hdto));
    }

    @Override
    public boolean update(HistorialDTO hdto) {
        return hdao.update(pasarDtoAHistorial(hdto));
        
    }

    @Override
    public boolean delete(Integer id_historial) {
        return hdao.delete(id_historial);
    }

    @Override
    public List<HistorialDTO> read() {
        List<HistorialDTO> listaHistoriales = new ArrayList();
        hdao.read().forEach(h -> listaHistoriales.add(pasarHistorialAdto(h)));
        return listaHistoriales;
    }

    

   
    
}
