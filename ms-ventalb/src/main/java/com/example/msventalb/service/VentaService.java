package com.example.msventalb.service;

import com.example.msventalb.entity.Venta;

import java.util.List;

public interface VentaService {
    public List<Venta> listar();
    public Venta guardar(Venta venta);
    public Venta buscarPorId(Integer id);
    public Venta editar(Venta venta);
    public void eliminar(Integer id);

}
