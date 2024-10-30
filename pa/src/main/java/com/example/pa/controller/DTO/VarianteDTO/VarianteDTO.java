package com.example.pa.controller.DTO.VarianteDTO;

import com.example.pa.model.Producto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class VarianteDTO {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    private String color;

    private String talla;

    private int stock;

    private boolean activo = true; // Indica si la variante está activa o eliminada

    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;

    
    //Constructor
    public VarianteDTO(Long id, String nombre, String color, String talla, int stock, boolean activo,
            Producto producto) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.talla = talla;
        this.stock = stock;
        this.activo = activo;
        this.producto = producto;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public String getTalla() {
        return talla;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setTalla(String talla) {
        this.talla = talla;
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
