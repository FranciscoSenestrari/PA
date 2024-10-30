package com.example.pa.controller.Mapper;

import com.example.pa.controller.DTO.CategoriaDTO.CategoriaDTO;
import com.example.pa.model.Categoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-29T23:37:45-0300",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public CategoriaDTO toDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        Long id = null;
        String nombre = null;
        String descripcion = null;
        boolean activo = false;

        id = categoria.getId();
        nombre = categoria.getNombre();
        descripcion = categoria.getDescripcion();
        activo = categoria.isActivo();

        CategoriaDTO categoriaDTO = new CategoriaDTO( id, nombre, descripcion, activo );

        return categoriaDTO;
    }

    @Override
    public Categoria toEntity(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Long id = null;
        String nombre = null;
        String descripcion = null;
        boolean activo = false;

        id = categoriaDTO.getId();
        nombre = categoriaDTO.getNombre();
        descripcion = categoriaDTO.getDescripcion();
        activo = categoriaDTO.isActivo();

        Categoria categoria = new Categoria( id, nombre, descripcion, activo );

        return categoria;
    }
}
