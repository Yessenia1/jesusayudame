package com.example.msventalb.controller;

import com.example.msventalb.entity.Venta;
import com.example.msventalb.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    private VentaService ventaService;

    @GetMapping
    public ResponseEntity<List<Venta>> listar() {
        return ResponseEntity.ok(ventaService.listar());
    }

    @PostMapping
    public ResponseEntity<Venta> guardar(@RequestBody Venta venta) {
        return ResponseEntity.ok(ventaService.guardar(venta));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> buscarPorId(@PathVariable(required = true) Integer id) {
        return ResponseEntity.ok(ventaService.buscarPorId(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Venta> editar(@PathVariable(required = true) Integer id,
                                            @RequestBody Venta venta) {
        venta.setId(id);
        return ResponseEntity.ok(ventaService.editar(venta));

    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable(required = true) Integer id) {
        ventaService.eliminar(id);
        return "Eliminacion correcta";
    }
}
