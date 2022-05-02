package Modelo;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class DetalleVentaBin implements Serializable {
    private int id_venta;
    private int id_cliente;
    private int id_empleado;
    private Date fecha;
    private Time hora;
    private String colonia;
    private String ciudad;
    private String calle;
    private String avenida;
    private String estado;
    private int total;
    private Boolean estatus_pago;

    public DetalleVentaBin(){}
    /***** Seleccionar todos ******/
    public DetalleVentaBin(int id_venta, int id_cliente, int id_empleado, Date fecha, Time hora, String colonia, String ciudad, String calle, String avenida, String estado, int total, Boolean estatus_pago) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.hora = hora;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        this.total = total;
        this.estatus_pago = estatus_pago;
    }

    /**** Eliminar*****/
    public DetalleVentaBin(int id_venta) {
        this.id_venta = id_venta;
    }

    /** Insertar ***/

    public DetalleVentaBin(int id_cliente, int id_empleado, Date fecha, Time hora, String colonia, String ciudad, String calle, String avenida, String estado, int total, Boolean estatus_pago) {
        this.id_cliente = id_cliente;
        this.id_empleado = id_empleado;
        this.fecha = fecha;
        this.hora = hora;
        this.colonia = colonia;
        this.ciudad = ciudad;
        this.calle = calle;
        this.avenida = avenida;
        this.estado = estado;
        this.total = total;
        this.estatus_pago = estatus_pago;
    }

    //Modificar pago


    public DetalleVentaBin(int id_venta, Boolean estatus_pago) {
        this.id_venta = id_venta;
        this.estatus_pago = estatus_pago;
    }

    // Modificar Total


    public DetalleVentaBin(int id_venta, int total) {
        this.id_venta = id_venta;
        this.total = total;
    }


}
