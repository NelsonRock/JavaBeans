/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bbdd;
import java.sql.*;
import Clases.*;
/**
 *
 * @author rcerrato
 */
public class BDInc {
private static Statement s;
private static Connection c;
private static ResultSet registro;
public static boolean buscarUsuario (Incidencia inc, BaseDatos BBDD)
	{
            //Usuario usu=null;
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
                        
            String cadena="SELECT * FROM usuarios WHERE email='"+ inc.getEmail() +"'";
                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
				//usu= new Usuario (registro.getString(1));
                                s.close();
				return true;
			}
			s.close();
			return false;
		}
		catch ( SQLException e)
		{	
			return false;
		}
	}
public static Usuario buscarUsuarioObjeto (Incidencia inc, BaseDatos BBDD)
	{
            Usuario usu=null;
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
                        
            String cadena="SELECT * FROM usuarios WHERE email='"+ inc.getEmail() +"'";
                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
				usu = new Usuario (registro.getString(1),registro.getString(2),registro.getString(3),registro.getString(4));
                                s.close();
				return usu;
			}
			s.close();
			return null;
		}
		catch ( SQLException e)
		{	
			return null;
		}
	}
public static boolean  añadirIncidencia(Incidencia inc, BaseDatos bbdd  ){
		String cadena="INSERT INTO problemas (email, aplicaciones, descripcion) VALUES('" + inc.getEmail() + "','" + inc.getAplicaciones()+"','" + inc.getDescripcion() + "')"; 	
		try{
		c=bbdd.getConexion();
		s=c.createStatement();
		s.executeUpdate(cadena);
		s.close();
                return true;
		}
		catch ( SQLException e){
			System.out.println(e.getMessage());
		}
                return false;
}
    
public static Incidencia buscarIdIncidencia(Incidencia inc, BaseDatos BBDD)
	{
            Incidencia mI=null;
		try
		{
			c=BBDD.getConexion();
			s=c.createStatement();
                        
            String cadena="SELECT max(id) FROM problemas WHERE email='"+ inc.getEmail() +"'";
                    
			registro =s.executeQuery(cadena);
			if(registro.next())
			{
				mI= new Incidencia (registro.getInt(1));
                                s.close();
				return mI;
			}
			s.close();
			return null;
		}
		catch ( SQLException e)
		{	
			return null;
		}
	}
public static boolean  añadirUsuario(Usuario inc, BaseDatos bbdd  ){
		String cadena="INSERT INTO usuarios (email, telefono, nombre, apellidos) VALUES('" + inc.getEmail() + "','" + inc.getTelefono()+"','" + inc.getNombre() + "' , '"+ inc.getApellidos()+"')"; 	
		try{
		c=bbdd.getConexion();
		s=c.createStatement();
		s.executeUpdate(cadena);
		s.close();
                return true;
		}
		catch ( SQLException e){
			System.out.println(e.getMessage());
		}
                return false;
}

}
