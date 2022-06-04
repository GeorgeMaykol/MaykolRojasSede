package com.idat.MaykolRojasSede.model;

import java.util.List;

public class Productos {
	
	private Integer idProductos;
	private String categoria;
	private List<Lavadora> listaLavadoras;
	
	public Integer getIdProductos() {
		return idProductos;
	}
	public void setIdProductos(Integer idProductos) {
		this.idProductos = idProductos;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public List<Lavadora> getListaLavadoras() {
		return listaLavadoras;
	}
	public void setListaLavadoras(List<Lavadora> listaLavadoras) {
		this.listaLavadoras = listaLavadoras;
	}
	
	

}
