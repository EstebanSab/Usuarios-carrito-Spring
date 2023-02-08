package com.example.restservice.usuario;


import javax.persistence.*;


@Entity
@Table
public class Usuario {

	@Id
	@SequenceGenerator(
		name = "usuario_sequence",
		sequenceName = "usuario_sequence",
		allocationSize = 1
	)

	@GeneratedValue(
		generator = "usuario_sequence",
		strategy = GenerationType.SEQUENCE)

	private Long id;

	@Column(name="nombre")
	private  String nombre;

	@Column(name="apellido")
	private String apellido;

	@Column(name="trabajo")
	private  String trabajo;
















	public Usuario(String nombre,String apellido,String trabajo) {
		this.nombre = nombre;
        this.apellido = apellido;
        this.trabajo = trabajo;
	}

	public Usuario() {}



	public Long getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

    public String getApellido() {
		return this.apellido;
	}

	public String getTrabajo() {
		return this.trabajo;
	}

    public void setNombre(String nuevoNombre) {
        this.nombre=nuevoNombre;
	}

    public void setApellido(String nuevoApellido) {
        this.apellido=nuevoApellido;
	}

	public void setTrabajo(String nuevoTrabajo){
		this.trabajo=nuevoTrabajo;
	}

	public void setId(Long id){
		this.id = id;
	}
}