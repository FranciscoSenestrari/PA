package com.example.pa.controller.DTO.VarianteDTO;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CrearVarianteDTO {
    
    @NotNull(message = "El nombre no puede estar vacío.")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres.")
    private String nombre;
   
   private String color;
   
    private String talla;

    @Min(value = 0, message = "El stock debe ser mayor o igual a 0.")
    private int stock;
    
    private Boolean activo = true;

    @NotNull(message = "El producto no puede estar vacío.")
    private Long productoId;

    // Método para verificar si todos los campos están vacíos
    public boolean isEmpty() {
        return nombre == null && color == null && talla == null && stock == 0 && activo == null && productoId == null;
    }

}
