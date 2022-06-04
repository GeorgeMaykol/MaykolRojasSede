package com.idat.MaykolRojasSede.model;

import java.util.List;

public class Telas {
	
	private Integer idTelas;
	private String tipoTela;
	private List<Ropa> listaRopas;
	
	public Integer getIdTelas() {
		return idTelas;
	}
	public void setIdTelas(Integer idTelas) {
		this.idTelas = idTelas;
	}
	public String getTipoTela() {
		return tipoTela;
	}
	public void setTipoTela(String tipoTela) {
		this.tipoTela = tipoTela;
	}
	public List<Ropa> getListaRopas() {
		return listaRopas;
	}
	public void setListaRopas(List<Ropa> listaRopas) {
		this.listaRopas = listaRopas;
	}
	
	
	

}
