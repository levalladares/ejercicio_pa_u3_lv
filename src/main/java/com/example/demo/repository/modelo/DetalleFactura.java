package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "detalleFactura")
@Entity
public class DetalleFactura {
	@GeneratedValue(generator ="seq_detalleFactura",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_detalleFactura",sequenceName = "seq_detalleFactura",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "defa_id")
	private Integer id;
	@Column(name = "defa_precioUnitario")
	private BigDecimal precioUnitario;
	@Column(name = "defa_subtotal")
	private BigDecimal subtotal;
	
	@OneToOne(mappedBy = "detalleFactura")
	private Factura factura;
	@OneToMany(mappedBy = "detalleFactura", cascade = CascadeType.ALL) 
	private List <Producto> productos;
	
	//GET Y SET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	
}
