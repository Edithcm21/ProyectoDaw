package Modelo;

import java.io.Serializable;

public class ClientesBin implements Serializable {
    private int id_cliente;
    private String nombre;
    private String apellido;
    //Como la direccion es un tipo en la class los pondre separados
    private String colonia;
    private String ciudad;
    private String calle;
    private String avenida;
    private String estado;
    private String Telefono;

    public ClientesBin()
    {

    }
    /**** Metodos *******/

    //Metodo para seleccionar todos los datos y para modificar


    public ClientesBin(int id_cliente, String nombre, String apellido, String colonia, String ciudad, String calle, String avenida, String estado, String telefono) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        Telefono = telefono;
    }

    //Metodo para insertar


    public ClientesBin(String nombre, String apellido, String colonia, String ciudad, String calle, String avenida, String estado, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        Telefono = telefono;
    }

    // Metodo para borrar y selecionar un solo registro


    public ClientesBin(int id_cliente) {
        this.id_cliente = id_cliente;
    }


    /********Getters and Setters****************************/

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAvenida() {
        return avenida;
    }

    public void setAvenida(String avenida) {
        this.avenida = avenida;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}


