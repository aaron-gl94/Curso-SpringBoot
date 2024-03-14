package com.api.firstapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Producto {
	private Integer	id;
	private String	nombre;
	private String	descripcion;
	private Double	precio;
}
