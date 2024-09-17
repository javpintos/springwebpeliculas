package com.cf.peliculas.entities;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="actores")
public class Actor implements Serializable{

	private static final long serialVersionUID = 4382623763435593630L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	@Column(name="url_imagen")
	private String UrlImagen;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUrlImagen() {
		return UrlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		UrlImagen = urlImagen;
	}
	
}
