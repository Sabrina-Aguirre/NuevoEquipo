
package Services;

import DAO.JugadorDAOImple;
import DTO.JugadorDTO;
import Model.Jugador;
import java.util.ArrayList;
import java.util.List;


public class JugadorServicesImple implements JugadorService {

    JugadorDAOImple jdao = new JugadorDAOImple();
    
    
    public JugadorDTO pasarJugadorAdto(Jugador j){
        
        JugadorDTO jugadorDto = new JugadorDTO();
        
        jugadorDto.setDni(j.getDni());
        jugadorDto.setNombre(j.getNombre());
        return jugadorDto;
    }
    public Jugador pasarDtoAJugador(JugadorDTO jdto){
        Jugador j = new Jugador();
        j.setDni(j.getDni());
        j.setNombre(j.getNombre());
        return j;
    }
    
    @Override
    public void insert(JugadorDTO jdto) {
        jdao.insert(pasarDtoAJugador(jdto));
    }

    @Override
    public boolean update(JugadorDTO jdto) {
        return jdao.update(pasarDtoAJugador(jdto));
        
    }

    @Override
    public boolean delete(Integer dni) {
        return jdao.delete(dni);
    }

    @Override
    public List<JugadorDTO> read() {
        List<JugadorDTO> listaJugadores = new ArrayList();
        jdao.read().forEach(j -> listaJugadores.add(pasarJugadorAdto(j)));
        return listaJugadores;
    }

   
    
}
