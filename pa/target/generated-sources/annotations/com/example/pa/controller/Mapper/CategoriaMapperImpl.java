package com.example.pa.controller.Mapper;

import com.example.pa.controller.DTO.CategoriaDTO.CategoriaDTO;
import com.example.pa.model.Categoria;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-29T09:18:06-0300",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.40.0.v20240919-1711, environment: Java 17.0.12 (Eclipse Adoptium)"
)
@Component
public class CategoriaMapperImpl implements CategoriaMapper {

    @Override
    public CategoriaDTO toDTO(Categoria categoria) {
        if ( categoria == null ) {
            return null;
        }

        boolean activo = false;
        Long id = null;
        String nombre = null;

        activo = categoria.isActivo();
        id = categoria.getId();
        nombre = categoria.getNombre();

        CategoriaDTO categoriaDTO = new CategoriaDTO( id, nombre, activo );

        return categoriaDTO;
    }

    @Override
    public Categoria toEntity(CategoriaDTO categoriaDTO) {
        if ( categoriaDTO == null ) {
            return null;
        }

        Categoria categoria = new Categoria();

        categoria.setActivo( categoriaDTO.isActivo() );
        categoria.setId( categoriaDTO.getId() );
        categoria.setNombre( categoriaDTO.getNombre() );

        return categoria;
    }
}
