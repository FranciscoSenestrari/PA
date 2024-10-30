package com.example.pa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Variante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    private String Tipo; // "Talla" , "Color"

    private String Valor; // "M" , "Rojo"

    private int stock;

    private boolean activo = true; // Indica si la variante está activa o eliminada

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return Tipo;
    }

    public String getTalla() {
        return Valor;
    }

    public int getStock() {
        return stock;
    }

    public boolean isActivo() {
        return activo;
    }

    public Producto getProducto() {
        return producto;
    }


    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setColor(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setTalla(String Valor) {
        this.Valor = Valor;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}