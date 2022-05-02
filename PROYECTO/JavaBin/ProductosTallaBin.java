package Modelo;

import java.io.Serializable;

public class ProductosTallaBin implements Serializable {
    private int id_producto;
    private int talla;
    private int cantidad;

    public ProductosTallaBin() {}

    //Seleccionar

    public ProductosTallaBin(int id_producto, int talla, int cantidad) {
        this.id_producto = id_producto;
        this.talla = talla;
        this.cantidad = cantidad;
    }

    // insertar
    // modificar
    public ProductosTallaBin(int talla, int cantidad) {

        this.talla = talla;
        this.cantidad = cantidad;
    }


   // eliminar
    public ProductosTallaBin(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
