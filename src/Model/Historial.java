
package Model;

import java.time.LocalDate;


public class Historial {
    private Equipo equipo;
    public int id_historial;
    public int id_equipo;
    public int id_jugador;
    public LocalDate fecha_in;
    public LocalDate fecha_fin;
    public String posicion;

    public Historial() {
    }

    public Historial(int id_historial, int id_equipo, int id_jugador, LocalDate fecha_in, LocalDate fecha_fin, String posicion) {
        this.id_historial = id_historial;
        this.id_equipo = id_equipo;
        this.id_jugador = id_jugador;
        this.fecha_in = fecha_in;
        this.fecha_fin = fecha_fin;
        this.posicion = posicion;
    }

   
    
    public Historial(Equipo equipo, int id_jugador, LocalDate fecha_in, LocalDate fecha_fin, String posición) {
        this.equipo = equipo;
        this.id_jugador = id_jugador;
        this.fecha_in = fecha_in;
        this.fecha_fin = fecha_fin;
        this.posicion = posición;
    }

    public int getId_historial() {
        return id_historial;
    }

    public void setId_historial(int id_historial) {
        this.id_historial = id_historial;
    }

    
    public int getId_equipo() {
        return id_equipo;
    }

    public void setId_equipo(int id_equipo) {
        this.id_equipo = id_equipo;
    }
    

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getId_jugador() {
        return id_jugador;
    }

    public void setId_jugador(int id_jugador) {
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
    
    
    @Override
    public String toString() {
        return "Historial{" + "equipo=" + equipo + ", id_jugador=" + id_jugador + ", fecha_in=" + fecha_in + ", fecha_fin=" + fecha_fin + ", posici\u00f3n=" + posicion + '}';
    }
    
    
}
