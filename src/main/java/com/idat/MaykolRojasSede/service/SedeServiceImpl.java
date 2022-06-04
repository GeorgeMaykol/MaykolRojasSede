package com.idat.MaykolRojasSede.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MaykolRojasSede.client.OpenFeignClient;
import com.idat.MaykolRojasSede.model.Sede;

@Service
public class SedeServiceImpl implements SedeService {
	
	@Autowired
	private OpenFeignClient clienteRest;

	@Override
	public List<Sede> asignarClientePorSede() {
		List<Sede> listarSede = new ArrayList<>();
		Sede sede = new Sede();
		sede.setIdSede(1);
		sede.setNombreSede("Miraflores");
		sede.setListaClientes(clienteRest.listarClientes());
		
		listarSede.add(sede);
		return listarSede;
	}
	

}
