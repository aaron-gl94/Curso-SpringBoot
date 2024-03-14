package com.api.firstapi;

import com.api.firstapi.model.Producto;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class TestController {
	
	@GetMapping
	public String firstRun() {		
		return "My first Spring Boot API!";
	}
	
	@GetMapping("/hello")
	public String hello() {		
		return "Hello world!";
	}
	
	@GetMapping("/bye")
	public String bye() {		
		return "Bye world!";
	}
	
	@GetMapping("/producto")
	public Producto get() {
		return new Producto (1, "Samsung Smart TV", "Pantalla Smart TV 32in, C7000S", 8800D); 
	}
	
	@GetMapping("/productos")
	public List<Producto> getProductos() {
		return getListProductos();
	}
	
	@GetMapping("/producto/{id}")
	public Producto getProduct(@PathVariable Integer id) {
		for (Producto prod: getListProductos()) {
			if (prod.getId() == id) {
				return prod;
			}
		} 
		
		return null;
	}

	// Función para generar una lista de productos estatica
	public static List<Producto> getListProductos() {
		List<Producto> listaProductos = new ArrayList<>();
		
		listaProductos.add(new Producto(1, "Samsung Smart TV - Crystal UHD - CU7000series", "Pantalla Smart TV 43in, CU7000s", 8800D));
		listaProductos.add(new Producto(2, "LG Smart TV", "Pantalla LG Smart TV 43in, WebOS", 7599D));
		listaProductos.add(new Producto(3, "Samsung Smart TV C8200 Series", "Pantalla Smart TV 60in, C8200S", 7599D));
		listaProductos.add(new Producto(4, "Philip Smart TV", "Pantalla Smart TV 60in, C8200S", 7599D));
		
		return listaProductos; 
	}
	
}