package Modelo;

import java.io.Serializable;

public class ProductosColorBin implements Serializable {
    private int id_producto;
    private int color;
    private int cantidad;

    public ProductosColorBin(){ }

    //insertar y modificar

    public ProductosColorBin(int color, int cantidad) {
        this.color = color;
        this.cantidad = cantidad;
    }

    // consultar


    public ProductosColorBin(int id_producto, int color, int cantidad) {
        this.id_producto = id_producto;
        this.color = color;
        this.cantidad = cantidad;
    }
    // eliminar

    public ProductosColorBin(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
