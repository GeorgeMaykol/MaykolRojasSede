package com.idat.MaykolRojasSede.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MaykolRojasSede.client.OpenFeignClient;
import com.idat.MaykolRojasSede.model.Productos;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private OpenFeignClient productoRest;

	@Override
	public List<Productos> asignarLavadoraPorProducto() {
		List<Productos> listarProductos = new ArrayList<>();
		Productos producto = new Productos();
		producto.setIdProductos(1);
		producto.setCategoria("Electrodomesticos");
		producto.setListaLavadoras(productoRest.listarLavadoras());
		
		listarProductos.add(producto);
		return listarProductos;
	}

}
