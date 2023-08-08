package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.ProductoRepository;
import com.example.demo.repository.modelo.Producto;
@Service
public class ProductoServiceImpl implements ProductoService {
	@Autowired
	private ProductoRepository productoRepository;
	@Override
	public void guardar(Producto producto) {
		// TODO Auto-generated method stub
		producto.setStock(producto.getStock());
		productoRepository.insertar(producto);
		
	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub
		productoRepository.actualizar(producto);
	}

	@Override
	public Producto buscar(Integer id) {
		// TODO Auto-generated method stub
		return productoRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		productoRepository.eliminar(id);
		
	}

}
