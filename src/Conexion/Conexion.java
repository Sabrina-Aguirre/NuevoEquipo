
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    
       Connection conn = null;
        
        String url = "jdbc:mysql://localhost:3308/afa?serverTimeZone=UTC";
        String us = "root";
        String pwd = "";
        
        //constructor de la clase 
        public void AbrirConexion(){
           
            try{
                //Obtener el driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                //obtenet la conexion
                conn=(Connection) DriverManager.getConnection(url,us,pwd);
                
               if(conn!=null){
                   System.out.println("Se pudo conectar a la base de datos ");
                }else{
                    System.out.println("***********No se pudo conectar");
                    
                }
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("ocurrio una ClassNotFoundException: " + e.getMessage());
                System.out.println(e.getMessage());
            }
        }  
       public Connection getConnection(){
           return conn;
       }
       public void desconectar(){
           conn=null;
      }
}
