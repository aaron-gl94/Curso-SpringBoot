package com.example.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
		
		System.out.println("\n\n\n");
    	System.out.println("String: HOLA MUNDO!!!");
    	
    	TipoDatos();
    	
	}
	
	public static void TipoDatos() {
		// **Tipos de datos primitivos:**
			// Enteros
			byte    numeroByte      = 127;                      // Rango: -128 a 127
			short   numeroShort     = 32767;                    // Rango: -32768 a 32767
			int     numeroInt       = 2147483647;               // Rango: -2147483648 a 2147483647
			long    numeroLong      = 9223372036854775807L;		// Rango: -9223372036854775808 a 9223372036854775807
			
			// Decimales
			float   numeroFloat     = 3.1415926535f;        	// Rango: -3.4028235E38 a 3.4028235E38
			double  numeroDouble    = 3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679;
			                                                	// Rango: -1.7976931348623157E308 a 1.7976931348623157E308
			// Caracteres
			char    caracter        = 'a';
			
			// Booleanos
			boolean verdadero       = true;
			boolean falso           = false;
		
			// **Impresiones en consola:**
			System.out.println("\n**Tipos de datos primitivos:**");
			System.out.println("Byte: " + numeroByte);
			System.out.println("Short: " + numeroShort);
			System.out.println("Int: " + numeroInt);
			System.out.println("Long: " + numeroLong);
			System.out.println("Float: " + numeroFloat);
			System.out.println("Double: " + numeroDouble);
			System.out.println("Caracter: " + caracter);
			System.out.println("Verdadero: " + verdadero);
			System.out.println("Falso: " + falso);
			
		// **Tipos de datos no primitivos:**
			// Cadenas
			String nombre = "Aarón García Lezama";
			
			// **Impresiones en consola:**
			System.out.println("\n**Tipo de dato no primitivo:**");
			System.out.println("String: " + nombre);
	    }
}
