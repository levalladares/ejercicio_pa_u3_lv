package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.ProductoService;

@SpringBootApplication
public class EjercicioPaU3P4LvApplication implements CommandLineRunner {
	@Autowired
	private ProductoService productoService;
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPaU3P4LvApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Producto p1 = new Producto();
		p1.setNombre("Paracetamol");
		p1.setCategoria("medicamentos para el dolor");
		p1.setCodigoDeBarras("12010210");
		p1.setPrecio(new BigDecimal(0.25));
		p1.setStock(50);
		this.productoService.guardar(p1);
		
		Producto p2 = new Producto();
		p2.setNombre("Paracetamol");
		p2.setCategoria("medicamentos para el dolor");
		p2.setCodigoDeBarras("12010210");
		p2.setPrecio(new BigDecimal(0.25));
		p2.setStock(50);
		this.productoService.guardar(p2);
	}

}
