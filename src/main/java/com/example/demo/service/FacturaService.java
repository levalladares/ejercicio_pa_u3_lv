package com.example.demo.service;

import com.example.demo.repository.modelo.Factura;

public interface FacturaService {
	public void crear (Factura factura);
	public void actualizar(Factura factura);
	public Factura buscar(Integer id);
	public void eliminar(Integer id);
}
