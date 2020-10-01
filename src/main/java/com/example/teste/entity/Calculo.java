package com.example.teste.entity;

import java.io.Serializable;

public class Calculo implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Double valor1;
	private Double valor2;
	
	public Calculo() {
	}

	public Calculo(Double valor1, Double valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public Double getValor1() {
		return valor1;
	}

	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}
}
