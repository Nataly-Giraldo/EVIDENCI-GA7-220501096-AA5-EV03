package com.edu.sena.models.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
//esta evidencia es la de GA7-220501096-AA4-EV03 Componente frontend del proyecto formativo y proyectos de clase (listas de chequeo).
@Entity //mapear o reastrear la base de datos
@Table (name="empleado")

public class Empleado {
	@Id //para indicar que es la llave primaria
	@Column(name="idemple",nullable=false)
	private int codigo;
	@Column(name="Nombreemple",nullable=false)
	private String nombre;
	@Column(name="Documento",nullable=false)
	private String iden;
	
	@OneToOne
	@JoinColumn(name = "usuario", nullable= false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn(name = "cargo", nullable = false)
	private Cargo cargo;
	
	//Mas adelante poner un Long o Bigint en documento reemplazondo a String*
	public Empleado() {
		//Se hace el contructor vacio para que mas adelante se pueda llenar con los datos
	}

	public Empleado(int codigo) {
		super();
		this.codigo = codigo;
	}

	public Empleado(String nombre, String iden, Usuario usuario, Cargo cargo) {
		super();
		this.nombre = nombre;
		this.iden = iden;
		this.usuario = usuario;
		this.cargo = cargo;
	}

	public Empleado(int codigo, String nombre, String iden, Usuario usuario, Cargo cargo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.iden = iden;
		this.usuario = usuario;
		this.cargo = cargo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getIden() {
		return iden;
	}

	public void setIden(String iden) {
		this.iden = iden;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	@OneToMany
	@JoinColumn(name = "empleado")
	private List<Registro> registro = new ArrayList<>();
}