package com.example.pa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pa.model.Producto;
import com.example.pa.service.StockService;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private StockService stockAlertaService;

    // Endpoint para obtener productos con stock bajo
    @GetMapping("/alertas")
    public List<Producto> obtenerProductosConStockBajo() {
        return stockAlertaService.obtenerProductosConStockBajo();
    }
}
