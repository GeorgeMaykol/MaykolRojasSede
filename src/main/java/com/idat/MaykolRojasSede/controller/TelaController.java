package com.idat.MaykolRojasSede.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.idat.MaykolRojasSede.model.Telas;
import com.idat.MaykolRojasSede.service.TelaService;

@Controller
@RequestMapping("/tela/v1")
public class TelaController {
	
	@Autowired
	private TelaService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Telas> listar(){
		return service.asignarRopaPorTela();
	}

}
