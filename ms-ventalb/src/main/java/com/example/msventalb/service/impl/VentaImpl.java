package com.example.msventalb.service.impl;

import com.example.msventalb.entity.Venta;
import com.example.msventalb.repository.VentaRepository;
import com.example.msventalb.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaImpl implements VentaService {
    @Autowired
    private VentaRepository ventaRepository;
    @Override
    public List<Venta> listar() {
        return ventaRepository.findAll();
    }

    @Override
    public Venta guardar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public Venta buscarPorId(Integer id) {
        return ventaRepository.findById(id).get();
    }

    @Override
    public Venta editar(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public void eliminar(Integer id) {
        ventaRepository.deleteById(id);
    }
}
