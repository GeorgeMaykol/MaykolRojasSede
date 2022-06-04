package com.idat.MaykolRojasSede.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MaykolRojasSede.model.Productos;
import com.idat.MaykolRojasSede.service.ProductoService;

@Controller
@RequestMapping("/producto/v1")
public class ProductoController {
	
	@Autowired
	private ProductoService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Productos> listar(){
		return service.asignarLavadoraPorProducto();
	}

}
