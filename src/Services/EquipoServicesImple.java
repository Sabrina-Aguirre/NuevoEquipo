package Services;

import DAO.EquipoDAOImple;
import DTO.EquipoDTO;
import DTO.HistorialDTO;
import DTO.JugadorDTO;
import Model.Equipo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EquipoServicesImple implements EquipoService {

    EquipoDAOImple eqda = new EquipoDAOImple();
    
    
    public EquipoDTO pasarEquipoAdto(Equipo e){
        
        EquipoDTO equipoDto = new EquipoDTO();
        
        equipoDto.setCuit(e.getCuit());
        equipoDto.setNombre(e.getNombre());
        equipoDto.setDivision(e.getDivision());
        return equipoDto;
    }
    public Equipo pasarDtoAEquipo(EquipoDTO dtoe){
        Equipo e = new Equipo();
        e.setCuit(e.getCuit());
        e.setNombre(e.getNombre());
        e.setDivision(e.getDivision());
        return e;
    }
    
    @Override
    public void insert(EquipoDTO eDto) {
        eqda.insert(pasarDtoAEquipo(eDto));
    }

    @Override
    public boolean update(EquipoDTO eDto) {
        return eqda.update(pasarDtoAEquipo(eDto));
        
    }

    @Override
    public boolean delete(int cuit) {
        return eqda.delete(cuit);
    }

    @Override
    public List<EquipoDTO> read() {
        List<EquipoDTO> listaEquipos = new ArrayList();
        eqda.read().forEach(e -> listaEquipos.add(pasarEquipoAdto(e)));
        return listaEquipos;
    }
    public List<JugadorDTO>cantDefensores(EquipoDTO e, String posicion){
        
        List<JugadorDTO> defensores = new ArrayList();
        
         if (e.getListaJugadores().size()>0){
             e.getListaJugadores().forEach(j->{
                 if (j.getListaHistoriales() != null && j.getListaHistoriales().size()>0){
                     j.getListaHistoriales().forEach(h -> {
                         if (e.getCuit().equals(h.getId_equipo()) && h.getPosicion().equals(h.getPosicion())) {
                             defensores.add(j);
                        
                     }
                     });
                     
                 }
                 
             });
             
         }
         return defensores;
        
    }
        
    
   public List<JugadorDTO> cantDeJugadoresEnEquipo(EquipoDTO e){
       List<JugadorDTO> listaJugadores = new ArrayList();
       if(e.getListaJugadores() != null && e.getListaJugadores().size()>0){
           e.getListaJugadores().forEach(j -> {
               j.getListaHistoriales().forEach(h -> {
               if (e.getCuit().equals(h.getId_equipo()) && (h.getFecha_fin() == null || h.getFecha_fin().isAfter(LocalDate.now()))){
               listaJugadores.add(j);
               }
               });
           });
       }
       return listaJugadores;
   }

    public List<JugadorDTO> cantDeJugadoresEnEquipoEnFecha( EquipoDTO e, LocalDate fecha) {
        
        List<JugadorDTO> jugadores = new ArrayList();
        
         if (e.getListaJugadores().size()>0){
             e.getListaJugadores().forEach(j->{
                 if (j.getListaHistoriales() != null && j.getListaHistoriales().size()>0){
                     j.getListaHistoriales().forEach(h -> {
                         if (e.getCuit().equals(h.getId_equipo()) && h.getFecha_in().isBefore(fecha) && h.getFecha_fin() == null || h.getFecha_fin().isAfter(fecha)) {
                             jugadores.add(j);
                        
                     }
                     });
                     
                 }
                 
             });
             
         }
                
           return jugadores; 
        }
        
    }


