package com.idat.MaykolRojasSede.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MaykolRojasSede.client.OpenFeignClient;
import com.idat.MaykolRojasSede.model.Telas;

@Service
public class TelaServiceImpl implements TelaService{
	
	
	@Autowired
	private OpenFeignClient telasRest;

	@Override
	public List<Telas> asignarRopaPorTela() {
		
		List<Telas> listarTelas = new ArrayList<>();
		Telas tela = new Telas();
		tela.setIdTelas(1);
		tela.setTipoTela("Seda");
		tela.setListaRopas(telasRest.listarRopas());
		
		listarTelas.add(tela);
		return listarTelas;
		
	}

}
