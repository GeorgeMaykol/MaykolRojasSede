package com.idat.MaykolRojasSede.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.MaykolRojasSede.model.Cliente;
import com.idat.MaykolRojasSede.model.Lavadora;
import com.idat.MaykolRojasSede.model.Ropa;

@FeignClient(name = "maykol-lavanderia", url = "localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/cliente/v1/listar")
	public List<Cliente> listarClientes();
	
	@GetMapping("/lavadora/v1/listar")
	public List<Lavadora> listarLavadoras();
	
	@GetMapping("/ropa/v1/listar")
	public List<Ropa> listarRopas();

}
