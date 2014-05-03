/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package consultorioecografico.conexion;
import consultorioecografico.frmPrincipal;
import javax.swing.*;

/**
 *
 * @author Administrador
 */
import java.sql.*;
 
/**
 * Clase que permite conectar con la base de datos
 * @author chenao
 *
 */

public class Conexion {
   /**Parametros de conexion*/
   static String bd = "consulecografico";
   static String login = "root";
   static String password = "admin";
   static String url = "jdbc:mysql://localhost/"+bd;
 
   Connection connection = null;
 
   /** Constructor de Conexion */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión
         connection = DriverManager.getConnection(url, login, password);
 
          /*if (connection!=null){
              
         /*    JOptionPane.showMessageDialog( null,
                                            "Conexión a base de datos "+bd+" OK",
                                            "Conexión",
                                            JOptionPane.INFORMATION_MESSAGE );
         
         }*/
      }
      catch(SQLException e){
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   /**Permite retornar la conexión*/
   public Connection getConnection(){
      return connection;
   }
 
   public void desconectar(){
      connection = null;
   }
}