package com.mercadv.contadorws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mercadv.commons.links.ContadorRs;
import com.mercadv.contadorws.controller.bean.WPersona;


@RestController
@RequestMapping(ContadorRs.PERSONA)
public class PersonaController {
	
	@PutMapping(ContadorRs.Persona.CREAR)
	public void crear(@RequestBody WPersona parm) {
		System.out.println("Ingresa al metodo crear");
	}
	
}
