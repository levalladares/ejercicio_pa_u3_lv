package com.example.demo.repository;

import com.example.demo.repository.modelo.Factura;

public interface FacturaRepository {
	public void insertar(Factura factura);
	public void actualizar(Factura factura);
	public Factura seleccionar(Integer id);
	public void eliminar(Integer id);

}
