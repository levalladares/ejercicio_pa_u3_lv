package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Table(name = "factura")
@Entity
public class Factura {
	
	@GeneratedValue(generator ="seq_factura",strategy = GenerationType.SEQUENCE )
	@SequenceGenerator(name = "seq_factura",sequenceName = "seq_factura",allocationSize = 1)// el allocationSize de coincidir con el valor que pusimos en el incremento
	@Id
	@Column(name = "fact_id")
	private Integer id;
	@Column(name = "fact_fecha")
	private LocalDate fecha;
	@Column(name = "fact_cedulaCliente")
	private String cedulaCliente;
	@Column(name = "fact_totalFactura")
	private BigDecimal totalFactura;
	
	@OneToOne(mappedBy = "factura")
	@JoinColumn(name = "fact_detalleFactura_id")
	private DetalleFactura detalleFactura;
	
	
	//GET Y SET 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public BigDecimal getTotalFactura() {
		return totalFactura;
	}
	public void setTotalFactura(BigDecimal totalFactura) {
		this.totalFactura = totalFactura;
	}
	public DetalleFactura getDetalleFactura() {
		return detalleFactura;
	}
	public void setDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFactura = detalleFactura;
	}
	
	
	
}
