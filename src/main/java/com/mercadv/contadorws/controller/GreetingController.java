package com.mercadv.contadorws.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mercadv.commons.db.factory.DatabaseFactory;
import com.mercadv.commons.db.factory.EDatabase;
import com.mercadv.commons.db.factory.IDatabase;
import com.mercadv.contadorws.bean.Greeting;


@RestController
@RequestMapping("/Greeting")
public class GreetingController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping(method = RequestMethod.GET, value = "/index")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/test") 
    public String test() {
    	IDatabase mysql = DatabaseFactory.getDatabase(EDatabase.MYSQL);
		mysql.getSchemaContador().getConnection();
    	return "hola...";
    }
}
