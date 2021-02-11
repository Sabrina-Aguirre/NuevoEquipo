
package Model;

import Conexion.Conexion;
import DTO.EquipoDTO;
import DTO.HistorialDTO;
import DTO.JugadorDTO;
import Services.EquipoServicesImple;
import Services.JugadorServicesImple;
import Services.HistorialServicesImple;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       
       //Services 
       EquipoServicesImple eserv = new EquipoServicesImple();
       JugadorServicesImple jserv = new JugadorServicesImple();
       HistorialServicesImple hserv = new HistorialServicesImple();
       
       //Listados:
       //Equipos
       List<EquipoDTO> listaEquipos = eserv.read();
       //Jugadores
       List<JugadorDTO> listaJugadores = jserv.read();
       //Historiales
       List<HistorialDTO> listaHistoriales = hserv.read();
       
       //Insert
       
       Scanner teclado = new Scanner(System.in);
       
       //Equipo
      /* EquipoDTO eDto = new EquipoDTO();
        System.out.println("Ingrese los datos del nuevo equipo: ");
        System.out.println("Cuit: ");
        eDto.setCuit(teclado.nextInt());
        System.out.println("Nombre: ");
        eDto.setNombre(teclado.next());
        System.out.println("Categoría: ");
        eDto.setDivision(teclado.next());
        eserv.insert(eDto);
        eserv.read();
        
        //Equipo
       JugadorDTO jdto = new JugadorDTO();
        System.out.println("Ingrese nuevo jugador: ");
        System.out.println("Dni: ");
        eDto.setCuit(teclado.nextInt());
        System.out.println("Nombre: ");
        eDto.setNombre(teclado.next());
        jserv.insert(jdto);
        jserv.read();*/
      
        System.out.println(eserv.delete(189271));
               
        
        
        
        
    }
    
}
