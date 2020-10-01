package com.example.teste.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CalculoService {
	
	public Double somar(Double valor1, Double valor2) {
		Double resultado = valor1 + valor2;
		return resultado;
	}
	
	public Double subtrair(Double valor1, Double valor2) {
		Double resultado = valor1 - valor2;
		return resultado;
	}
	
	public Double dividir(Double valor1, Double valor2) {
		Double resultado = valor1 / valor2;
		return resultado;
	}

	public Double multiplicar(Double valor1, Double valor2) {
		Double resultado = valor1 * valor2;
		return resultado;
	}
	
	public Double raizquadrada(Double valor) {
		Double resultado = Math.sqrt(valor);
		return resultado;
	}
	
	public List<Double> equacao2grau(Double a, Double b, Double c) {
		Double delta = Math.pow(b, 2) - (4 * a * c);
		if(delta < 0) {
			throw new RuntimeException("Equação sem valores reais!");
		}else {
			Double x1 = ((- b) - (Math.sqrt(delta))) / b * a;
			Double x2 = ((- b) + (Math.sqrt(delta))) / b * a;
			List<Double> list = new ArrayList<>();
			list.add(x1);
			list.add(x2);
			return list;
		}
	}
}
