package com.example.pa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import com.example.pa.model.Producto;
import com.example.pa.repository.ProductoRepository;

@Service
public class StockService {
     
    
    @Autowired
    private static ProductoRepository productoRepository;

    // Método que devuelve productos con stock bajo
    public List<Producto> obtenerProductosConStockBajo() {
        return productoRepository.findAll()
            .stream()
            .filter(producto -> producto.getStock() < producto.getUmbralStockBajo())
            .collect(Collectors.toList());
        }

     // Método que verifica los niveles de stock y envía alertas
     public void verificarStock() {
        List<Producto> productosConStockBajo = obtenerProductosConStockBajo();
        for (Producto producto : productosConStockBajo) {
            enviarAlerta(producto);
        }
    }

    private void enviarAlerta(Producto producto) {
        // Implementar la lógica para enviar la alerta
        System.out.println("Alerta: El stock de " + producto.getNombre() + " está bajo. Stock actual: " + producto.getStock());
    }

    public void registrarAjusteStock(Long productoId, Integer cantidadAjustada, String razonAjuste) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registrarAjusteStock'");
    }
}
