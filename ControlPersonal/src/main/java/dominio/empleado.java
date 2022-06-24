/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Camilo Estupiñan
 */
public class empleado {
    private int id_empleados;
    private String documento_tipo;
    private String documento_numero;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String direccion;
    private String correo_electronico;
    private String telefono;
    private String fecha_hora_crea;
    private String fecha_hora_modifica;
    private int fk_id_departamento;

    public empleado(int id_empleados) {
        this.id_empleados = id_empleados;
    }
    
    public empleado(){
    }

    public empleado(int id_empleados, String documento_tipo, String nombres, String apellidos, String ciudad, String direccion, String correo_electronico, String telefono, String fecha_hora_crea, String fecha_hora_modifica, int fk_id_departamento) {
        this.id_empleados = id_empleados;
        this.documento_tipo = documento_tipo;
        this.documento_numero = documento_numero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.fecha_hora_crea = fecha_hora_crea;
        this.fecha_hora_modifica = fecha_hora_modifica;
        this.fk_id_departamento = fk_id_departamento;
    }
       public empleado(String documento_tipo, String nombres, String apellidos, String ciudad, String direccion, String correo_electronico, String telefono, String fecha_hora_crea, String fecha_hora_modifica, int fk_id_departamento) {
        this.id_empleados = id_empleados;
        this.documento_tipo = documento_tipo;
        this.documento_numero = documento_numero;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.correo_electronico = correo_electronico;
        this.telefono = telefono;
        this.fecha_hora_crea = fecha_hora_crea;
        this.fecha_hora_modifica = fecha_hora_modifica;
        this.fk_id_departamento = fk_id_departamento;
    } 

    public int getId_empleados() {
        return id_empleados;
    }

    public void setId_empleados(int id_empleados) {
        this.id_empleados = id_empleados;
    }

    public String getDocumento_tipo() {
        return documento_tipo;
    }

    public void setDocumento_tipo(String documento_tipo) {
        this.documento_tipo = documento_tipo;
    }
    public String getDocumento_numero() {
        return documento_tipo;
    }

    public void setDocumento_numero(String documento_numero) {
        this.documento_numero = documento_numero;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_hora_crea() {
        return fecha_hora_crea;
    }

    public void setFecha_hora_crea(String fecha_hora_crea) {
        this.fecha_hora_crea = fecha_hora_crea;
    }

    public String getFecha_hora_modifica() {
        return fecha_hora_modifica;
    }

    public void setFecha_hora_modifica(String fecha_hora_modifica) {
        this.fecha_hora_modifica = fecha_hora_modifica;
    }

    public int getFk_id_departamento() {
        return fk_id_departamento;
    }

    public void setFk_id_departamento(int fk_id_departamento) {
        this.fk_id_departamento = fk_id_departamento;
    }

    @Override
    public String toString() {
        return "empleado{" + "id_empleados=" + id_empleados + ", documento_tipo=" + documento_tipo + ",documento_numero=" + documento_numero + ", nombres=" + nombres + ", apellidos=" + apellidos + ", ciudad=" + ciudad + ", direccion=" + direccion + ", correo_electronico=" + correo_electronico + ", telefono=" + telefono + ", fecha_hora_crea=" + fecha_hora_crea + ", fecha_hora_modifica=" + fecha_hora_modifica + ", fk_id_departamento=" + fk_id_departamento + '}';
    }
       
    
    
}
