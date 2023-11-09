package com.edu.sena.models.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
//esta evidencia es la de GA7-220501096-AA3-EV01=codificación de módulos del software Stand alone, web y móvil de acuerdo al proyecto a desarrollar

@Entity //mapear o reastrear la base de datos
@Table (name="clientes")

public class Clientes {
	@Id //para indicar que es la llave primaria
	@Column(name="idclien",nullable=false)
	private int codigo;
	@Column(name="nombreclien",nullable=false)
	private String nombre;
	@Column(name="celular",nullable=false)
	private String cel;
	@Column(name="direccion",nullable=false)
	private String dire;
	@Column(name="documento",nullable=false)
	private String iden;
	//Mas adelante poner un Long o Bigint en documento reemplazondo a String*
	
	@OneToMany
	@JoinColumn(name = "clientes")
	private List<Registro> registro = new ArrayList<>();
	
	public Clientes() {
		//Se hace el contructor vacio para que mas adelante se pueda llenar con los datos
	}
	
	public Clientes(int codigo, String nombre, String cel, String dire, String iden) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.cel = cel;
		this.dire = dire;
		this.iden = iden;
	}

	public Clientes(int codigo) {
		super();
		this.codigo = codigo;
	}
	
	

	public Clientes(String nombre, String cel, String dire, String iden, List<Registro> registro) {
		super();
		this.nombre = nombre;
		this.cel = cel;
		this.dire = dire;
		this.iden = iden;
		this.registro = registro;
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

	public String getCel() {
		return cel;
	}

	public void setCel(String cel) {
		this.cel = cel;
	}

	public String getDire() {
		return dire;
	}

	public void setDire(String dire) {
		this.dire = dire;
	}

	public String getIden() {
		return iden;
	}

	public void setIden(String iden) {
		this.iden = iden;
	}
}