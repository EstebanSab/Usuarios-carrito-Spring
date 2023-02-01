package com.example.restservice.usuario;

import java.util.List;
import java.util.ArrayList;

public class Usuario {

    private static int asignadorId = 0;
	private final int id;
	private  String nombre;
	private String apellido;
	private  String trabajo;
	private List<Integer> amigos;

	public Usuario(String nombre,String apellido,String trabajo) {
		this.id = asignadorId++;
		this.nombre = nombre;
        this.apellido = apellido;
        this.trabajo = trabajo;
		this.amigos = new ArrayList<Integer>();
	}


	public void agregarAmigo(int amigo){
		this.amigos.add(amigo);
	}

	public int getId() {
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

	public List<Integer> getAmigos() {
		return this.amigos;
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
}