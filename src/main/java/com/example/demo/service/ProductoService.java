package com.example.demo.service;

import com.example.demo.repository.modelo.Producto;

public interface ProductoService {
	public void guardar(Producto producto);
	public void actualizar(Producto producto);
	public Producto buscar(Integer id);
	public void eliminar(Integer id);
}
