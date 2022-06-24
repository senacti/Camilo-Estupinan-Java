/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datos;

import dominio.empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Camilo Estupiñan
 */
public class empleadoDaoJDBC {
  
    private static final String SQL_SELECT="SELECT id_empleados, documento_tipo, documento_numero, nombres, apellidos, ciudad, direccion, correo_electronico, telefono, fecha_hora_crea, fecha_hora_modifica FROM empleados";    
    private static final String SQL_SELECT_BY_ID="SELECT id_empleados, documento_tipo, documento_numero, nombres, apellidos, ciudad, direccion, correo_electronico, telefono, fecha_hora_crea, fecha_hora_modifica FROM empleados WHERE id_empleado=?";
    private static final String SQL_INSERT="INSERT INTO empleados( documento_tipo, documento_numero, nombres, apellidos, ciudad) VALUES(?,?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE empleados SET documento_tipo=?, documento_numero=?, nombres=?, apellidos=?, ciudad=?, direccion=?, correo_electronico=?, telefono=?";  
    private static final String SQL_DELETE="DELETE FROM cliente WHERE id_empleados=?";
    
    public List<empleado> listar(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<empleado> empleados=new ArrayList<empleado>();   
        
        try{
            conn =Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_SELECT);
            rs=stmt.executeQuery();
            while (rs.next()){
                int id_empleados=rs.getInt("id_empleado");
                String documento_tipo=rs.getString("documento_tipo");
                String documento_numero=rs.getString("documento_numero");
                String nombres=rs.getString("nombres");
                String apellidos=rs.getString("apellidos");
                String ciudad=rs.getString("ciudad");
                String direccion=rs.getString("direccion");
                String correo_electronico=rs.getString("correo_electronico");
                String telefono=rs.getString("telefono");
                String fecha_hora_crea=rs.getString("fecha_hora_crea");
                String fecha_hora_modifica=rs.getString("fecha_hora_modifica");
                
                empleados.add(new empleado(id_empleados, documento_tipo, documento_numero, nombres, apellidos, ciudad, direccion, correo_electronico, telefono, fecha_hora_crea, fecha_hora_modifica));
            }
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.Close(rs);
            Conexion.Close(stmt);
            Conexion.Close(conn);
        } 
        
        
        return empleados;
    } 

public empleado buscar(empleado empleado){
     Connection conn = null;
     PreparedStatement stmt = null;
     ResultSet rs = null;
     List<empleado> empleados=new ArrayList<empleado>();   
        
        try{
            conn =Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, empleado.getId_empleados());
            rs=stmt.executeQuery();
            rs.next();
            while (rs.next()){
                int id_empleados=rs.getInt("id_empleado");
                String documento_tipo=rs.getString("documento_tipo");
                String documento_numero=rs.getString("documento_numero");
                String nombres=rs.getString("nombres");
                String apellidos=rs.getString("apellidos");
                String ciudad=rs.getString("ciudad");
                String direccion=rs.getString("direccion");
                String correo_electronico=rs.getString("correo_electronico");
                String telefono=rs.getString("telefono");
                String fecha_hora_crea=rs.getString("fecha_hora_crea");
                String fecha_hora_modifica=rs.getString("fecha_hora_modifica");
             
                empleado.setDocumento_tipo(documento_tipo);
                empleado.setDocumento_numero(documento_numero);
                empleado.setNombres(nombres);
                empleado.setApellidos(apellidos);
                empleado.setCiudad(ciudad);
                empleado.setDireccion(direccion);
                empleado.setCorreo_electronico(correo_electronico);
                empleado.setTelefono(telefono);
                empleado.setFecha_hora_crea(fecha_hora_crea);
                empleado.setFecha_hora_modifica(fecha_hora_modifica);
            }
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.Close(rs);
            Conexion.Close(stmt);
            Conexion.Close(conn);
        } 
        
        
        return empleado;  
}

public int insertar(empleado empleado){
    Connection conn = null;
     PreparedStatement stmt = null;
     int rous = 0;
       
        try{
            conn =Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, empleado.getDocumento_tipo());
            stmt.setString(2, empleado.getDocumento_numero());
            stmt.setString(3, empleado.getNombres());
            stmt.setString(4, empleado.getApellidos());
            stmt.setString(5, empleado.getCiudad());
            stmt.setString(6, empleado.getDireccion());
            stmt.setString(7, empleado.getCorreo_electronico());
            stmt.setString(8, empleado.getTelefono());
            stmt.setString(9, empleado.getFecha_hora_crea());
            stmt.setString(10, empleado.getFecha_hora_modifica());          
            
            rous=stmt.executeUpdate();
            
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.Close(stmt);
            Conexion.Close(conn);
        } 
        
        
        return rous;
}

public int actualizar(empleado empleado){
    Connection conn = null;
     PreparedStatement stmt = null;
     int rous = 0;
       
        try{
            conn =Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, empleado.getDocumento_tipo());
            stmt.setString(2, empleado.getDocumento_numero());
            stmt.setString(3, empleado.getNombres());
            stmt.setString(4, empleado.getApellidos());
            stmt.setString(5, empleado.getCiudad());
            stmt.setString(6, empleado.getDireccion());
            stmt.setString(7, empleado.getCorreo_electronico());
            stmt.setString(8, empleado.getTelefono());
            stmt.setString(9, empleado.getFecha_hora_crea());
            stmt.setString(10, empleado.getFecha_hora_modifica());
            stmt.setInt(11, empleado.getId_empleados());          

            
            rous=stmt.executeUpdate();
            
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.Close(stmt);
            Conexion.Close(conn);
        } 
        
        
        return rous;
}

public int eliminar(empleado empleado){
    
    Connection conn = null;
     PreparedStatement stmt = null;
     int rous = 0;
       
        try{
            conn =Conexion.getConnection();
            stmt=conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, empleado.getId_empleados());          

            
            rous=stmt.executeUpdate();
            
        }catch (Exception e){
            e.printStackTrace(System.out);
        }finally{
            Conexion.Close(stmt);
            Conexion.Close(conn);
        } 
        
        
        return rous;
}
}
