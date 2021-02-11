
package DTO;

import java.time.LocalDate;


public class HistorialDTO {
    private Integer id_historial;
    private Integer id_equipo;
    private Integer id_jugador;
    private LocalDate fecha_in;
    private LocalDate fecha_fin;
    private String posicion;

    public HistorialDTO() {
    }

    public HistorialDTO(Integer id_historial, Integer id_equipo, Integer id_jugador, LocalDate fecha_in, LocalDate fecha_fin, String posicion) {
        this.id_historial = id_historial;
        this.id_equipo = id_equipo;
        this.id_jugador = id_jugador;
        this.fecha_in = fecha_in;
        this.fecha_fin = fecha_fin;
        this.posicion = posicion;
    }

    public Integer getId_historial() {
        return id_historial;
    }

    public void setId_historial(Integer id_historial) {
        this.id_historial = id_historial;
    }

    public Integer getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(Integer id_equipo) {
        this.id_equipo = id_equipo;
    }

    public Integer getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(Integer id_jugador) {
        this.id_jugador = id_jugador;
    }

    public LocalDate getFecha_in() {
        return fecha_in;
    }

    public void setFecha_in(LocalDate fecha_in) {
        this.fecha_in = fecha_in;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    
}
