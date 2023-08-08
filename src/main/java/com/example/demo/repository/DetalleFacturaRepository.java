package com.example.demo.repository;

import com.example.demo.repository.modelo.DetalleFactura;

public interface DetalleFacturaRepository {
	public void insertar(DetalleFactura detalleFactura);
	public void actualizar(DetalleFactura detalleFactura);
	public DetalleFactura seleccionar(Integer id);
	public void eliminar(Integer id);
}
