package com.example.teste.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste.service.CalculoService;

@RestController
@RequestMapping(value="/calculo")
public class CalculoResource {
	
	@Autowired(required=true)
	private CalculoService service;
	
	@GetMapping(value="/somar")
	@ResponseBody
	public ResponseEntity<Double> somar(@RequestParam Double valor1, @RequestParam Double valor2) {
		Double resultado = service.somar(valor1, valor2);
		return ResponseEntity.ok().body(resultado);
	}
	
	@GetMapping(value="/subtrair")
	@ResponseBody
	public ResponseEntity<Double> subtrair(@RequestParam Double valor1, @RequestParam Double valor2) {
		Double resultado = service.subtrair(valor1, valor2);
		return ResponseEntity.ok().body(resultado);
	}
	
	@GetMapping(value="/multiplicar")
	@ResponseBody
	public ResponseEntity<Double> multiplicar(@RequestParam Double valor1, @RequestParam Double valor2) {
		Double resultado = service.multiplicar(valor1, valor2);
		return ResponseEntity.ok().body(resultado);
	}
	
	@GetMapping(value="/dividir")
	@ResponseBody
	public ResponseEntity<Double> dividir(@RequestParam Double valor1, @RequestParam Double valor2) {
		Double resultado = service.dividir(valor1, valor2);
		return ResponseEntity.ok().body(resultado);
	}
	
	@GetMapping(value="/equacao2grau")
	@ResponseBody
	public ResponseEntity<List<Double>> dividir(@RequestParam Double a, @RequestParam Double b, @RequestParam Double c) {
		List<Double> resultado = service.equacao2grau(a, b, c);
		return ResponseEntity.ok().body(resultado);
	}

}
