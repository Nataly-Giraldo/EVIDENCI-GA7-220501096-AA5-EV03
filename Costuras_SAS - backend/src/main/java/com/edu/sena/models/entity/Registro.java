package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="regristro")
public class Registro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementar
	@Column(name="Id_factura",nullable=false)
	private int codigo;
	@Column(name="Solicitud_del_cliente",nullable=false,length = 255)
	private String solicitud;
	
	@ManyToOne
	@JoinColumn(name = "clientes", nullable = false)
	private Clientes clientes;
	
	@ManyToOne
	@JoinColumn(name = "empleado", nullable = false)
	private Empleado empleado;
	
	@ManyToOne
	@JoinColumn(name = "Medios_pagos", nullable = false)
	private Medios_pagos medios_pagos;

	public Registro() {
		super();
	}

	public Registro(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Registro(String solicitud, Clientes clientes, Empleado empleado, Medios_pagos medios_pagos) {
		super();
		this.solicitud = solicitud;
		this.clientes = clientes;
		this.empleado = empleado;
		this.medios_pagos = medios_pagos;
	}

	public Registro(int codigo, String solicitud, Clientes clientes, Empleado empleado, Medios_pagos medios_pagos) {
		super();
		this.codigo = codigo;
		this.solicitud = solicitud;
		this.clientes = clientes;
		this.empleado = empleado;
		this.medios_pagos = medios_pagos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	public Medios_pagos getMedios_pagos() {
		return medios_pagos;
	}

	public void setMedios_pagos(Medios_pagos medios_pagos) {
		this.medios_pagos = medios_pagos;
	}
}