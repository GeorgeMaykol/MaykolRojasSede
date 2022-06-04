package com.idat.MaykolRojasSede.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MaykolRojasSede.model.Sede;
import com.idat.MaykolRojasSede.service.SedeService;


@Controller
@RequestMapping("/sede/v1")
public class SedeController {
	
	@Autowired
	private SedeService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Sede> listar(){
		return service.asignarClientePorSede();
	}

}
