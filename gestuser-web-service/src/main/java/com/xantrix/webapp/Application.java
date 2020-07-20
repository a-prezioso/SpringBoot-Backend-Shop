package com.xantrix.webapp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.xantrix.webapp.model.Utenti;
import com.xantrix.webapp.service.UtentiService;

@SpringBootApplication
public class Application {
	

	@Autowired
	private static BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private static UtentiService utenti;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		Utenti outente = new Utenti();
		String encodedPassword = passwordEncoder.encode("ciaone");
		outente.setPassword(encodedPassword);
		outente.setUserId("ciao");
		List<String> ruoli = new ArrayList<String>();
		ruoli.add("ADMIN");
		outente.setRuoli(ruoli);
		System.out.println("prova");
		utenti.Save(outente);
		
	}

}
