package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.modelo.Factura;

public class FacturaServiceImpl implements FacturaService{
	@Autowired
	private FacturaRepository facturarRepository;
	@Override
	public void crear(Factura factura) {
		// TODO Auto-generated method stub
		this.facturarRepository.insertar(factura);
	}

	@Override
	public void actualizar(Factura factura) {
		// TODO Auto-generated method stub
		this.facturarRepository.actualizar(factura);
	}

	@Override
	public Factura buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.facturarRepository.seleccionar(id);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.facturarRepository.eliminar(id);
	}
	

}
