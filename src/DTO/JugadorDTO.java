
package DTO;

import java.util.List;

public class JugadorDTO {
    private Integer dni;
    private String nombre;
    private List<HistorialDTO> listaHistoriales;

    public JugadorDTO() {
    }

    public JugadorDTO(Integer dni, String nombre, List<HistorialDTO> listaHistoriales) {
        this.dni = dni;
        this.nombre = nombre;
        this.listaHistoriales = listaHistoriales;
    }

    public List<HistorialDTO> getListaHistoriales() {
        return listaHistoriales;
    }

    public void setListaHistoriales(List<HistorialDTO> listaHistoriales) {
        this.listaHistoriales = listaHistoriales;
    }

    

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
