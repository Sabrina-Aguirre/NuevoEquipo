
package Model;

import java.util.List;


public class Jugador {
    public int dni;
    public String nombre;
    private List <Historial> listaHistoriales;
    
   
    
    public Jugador() {
    }

    public Jugador(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    
    
    public Jugador(int dni, String nombre, List <Historial> listaHistoriales) {
        this.dni = dni;
        this.nombre = nombre;
        this.listaHistoriales = listaHistoriales;
        
    }
   
   
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List <Historial> getHistorial() {
        return listaHistoriales;
    }

    public void setHistorial(List <Historial> listaHistoriales) {
        this.listaHistoriales = listaHistoriales;
    }
    
    
    
    @Override
    public String toString() {
        return "Jugador{" + "dni=" + dni + ", nombre=" + nombre + ", listaHistoriales=" + listaHistoriales + '}';
    }
    
    
    
}

