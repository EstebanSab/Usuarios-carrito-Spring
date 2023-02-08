package com.example.restservice.producto;


import javax.persistence.*;


@Entity
@Table
public class Producto {

	@Id
	@SequenceGenerator(
		name = "producto_sequence",
		sequenceName = "producto_sequence",
		allocationSize = 1
	)

	@GeneratedValue(
		generator = "producto_sequence",
		strategy = GenerationType.SEQUENCE)

	private Long id;

	@Column(name="nombre")
	private  String nombre;

	@Column(name="calidad")
	private String calidad;

	@Column(name="tipo")
	private  String tipo;


	public Producto(String nombre,String calidad,String tipo) {
		this.nombre = nombre;
        this.tipo = tipo;
        this.calidad = calidad;
	}

	public Producto() {}



	public Long getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

    public String getCalidad() {
		return this.calidad;
	}

	public String getTipo() {
		return this.tipo;
	}

    public void setNombre(String nuevoNombre) {
        this.nombre=nuevoNombre;
	}

    public void setCalidad(String calidad) {
        this.calidad=calidad;
	}

	public void setTipo(String tipo){
		this.tipo=tipo;
	}

	public void setId(Long id){
		this.id = id;
	}
}