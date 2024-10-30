package com.example.pa.controller.Mapper;

import com.example.pa.controller.DTO.VarianteDTO.VarianteDTO;
import com.example.pa.model.Variante;

public class VarianteMapper {
    
// Convierte de DTO a entidad
public static Variante toEntity(VarianteDTO dto) {
    Variante variante = new Variante();
    variante.setId(dto.getId());
    variante.setNombre(dto.getNombre());
    variante.setColor(dto.getColor());
    variante.setTalla(dto.getTalla());
    variante.setStock(dto.getStock());
    variante.setActivo(dto.isActivo());
    return variante;
}

// Convierte de entidad a DTO
public static VarianteDTO toDTO(Variante variante) {
    VarianteDTO dto = new VarianteDTO(null, null, null, null, 0, false, null);
    dto.setId(variante.getId());
    dto.setNombre(variante.getNombre());
    dto.setColor(variante.getColor());
    dto.setTalla(variante.getTalla());
    dto.setStock(variante.getStock());
    dto.setActivo(variante.isActivo());
    return dto;
}
}
