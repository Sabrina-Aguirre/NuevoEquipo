
package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Equipo {
    public Integer cuit;
    public String nombre;
    public String division;
    private LocalDate fechasPriDivInicio;
    private LocalDate fechasPriDivFin;
    private List <Jugador> listaJugadores;
   

    public Equipo() {
    }

    public Equipo(Integer cuit, String nombre, String division) {
        this.cuit = cuit;
        this.nombre = nombre;
        this.division = division;
    }

    
    
    public Equipo(String nombre, LocalDate fechasPriDivInicio, LocalDate fechasPriDivFin, List <Jugador> listaJugadores) {
        this.nombre = nombre;
        this.fechasPriDivInicio = fechasPriDivInicio;
        this.fechasPriDivFin = fechasPriDivFin;
         this.listaJugadores = listaJugadores;
        
    }
    
    public Equipo(String nombre, LocalDate fechasPriDivInicio, LocalDate fechasPriDivFin ) {
        this.nombre = nombre;
        this.fechasPriDivInicio = fechasPriDivInicio;
        this.fechasPriDivFin = fechasPriDivFin;
        listaJugadores = new ArrayList();
         
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Integer getCuit() {
        return cuit;
    }

    public void setCuit(Integer cuit) {
        this.cuit = cuit;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
    

    

    public LocalDate getFechasPriDivInicio() {
        return fechasPriDivInicio;
    }

    public void setFechasPriDivInicio(LocalDate fechasPriDivInicio) {
        this.fechasPriDivInicio = fechasPriDivInicio;
    }

    public LocalDate getFechasPriDivFin() {
        return fechasPriDivFin;
    }

    public void setFechasPriDivFin(LocalDate fechasPriDivFin) {
        this.fechasPriDivFin = fechasPriDivFin;
    }
    

    private Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    /*@Override
    public int compareTo(Object o) {
        Equipo e = (Equipo) o;
        return nombre.compareTo(e.nombre);
    }
    
    
    public boolean agregarJugador(Jugador jugador){
        return listaJugadores.add(jugador);
    }
   
    public List <Jugador> cantDeJugadoresEnEquipoEnFecha(LocalDate fecha){
        List <Jugador> jugadores = new ArrayList();
        for(Jugador j:listaJugadores){
            for(Historial h: j.listaHistoriales){
                if(h.fecha_in.isBefore(fecha) && h.fecha_fin.isAfter(fecha)){
                    if(h.equipo.nombre.equals(nombre)){
                        jugadores.add(j);
                    }
                }
            }
        }
        return jugadores;
    }
    
    public int cantDefensores(String posicion){
    int cont = 0;
    for (Jugador e: jugadores){
        if(e.posicion.equalsIgnoreCase(posicion))
            cont++;
    }
        return cont;
    }*/
    @Override
    public String toString() {
        return "Equipo{" + "cuit=" + cuit + ", nombre=" + nombre + ", division=" + division + ", fechasPriDivInicio=" + fechasPriDivInicio + ", fechasPriDivFin=" + fechasPriDivFin + ", listaJugadores=" + listaJugadores + '}';
    }

    
    
}