
package com.edu.sena.models.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//esta evidencia es la de o	GA7-220501096-AA5-EV03: Diseño y desarrollo de servicios web - proyecto y o	GA7-220501096-AA4-EV03 Componente frontend del proyecto formativo y proyectos de clase (listas de chequeo)

@Entity
@Table(name="medios_pagos")
public class Medios_pagos {

	@Id
	@Column(name="IdMedios_de_pagos", nullable=false)
	private int codigo;
	@Column(name="Efectivo",nullable=false)
	private String efectivo;
	@Column(name="Nombre_banco",nullable=false)
	private String nombre;
	
	@OneToMany
	@JoinColumn(name = "medios_pagos")
	private List<Registro> registro = new ArrayList<>();
	
	public Medios_pagos() {
		super();
	}
	public Medios_pagos(int codigo, String efectivo, String nombre) {
		super();
		this.codigo = codigo;
		this.efectivo = efectivo;
		this.nombre = nombre;
	}
	
	public Medios_pagos(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	public Medios_pagos(String efectivo, String nombre, List<Registro> registro) {
		super();
		this.efectivo = efectivo;
		this.nombre = nombre;
		this.registro = registro;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getEfectivo() {
		return efectivo;
	}
	public void setEfectivo(String efectivo) {
		this.efectivo = efectivo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}