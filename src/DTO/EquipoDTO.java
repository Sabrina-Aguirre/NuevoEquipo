
package DTO;

import java.time.LocalDate;
import java.util.List;


public class EquipoDTO {
    private Integer cuit;
    private String nombre;
    private String division;
    public List <JugadorDTO> listaJugadores;

    public EquipoDTO() {
    }

    public EquipoDTO(Integer cuit, String nombre, String division, List<JugadorDTO> listaJugadores) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.division = division;
        this.listaJugadores = listaJugadores;
    }

    public List<JugadorDTO> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<JugadorDTO> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

   

    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
   
    
}
