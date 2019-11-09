package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.example.dao.ProduitRepository;
import com.example.entities.Produit;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepository;
	
	public static void main(String[] args)  {
		SpringApplication.run(Demo1Application.class, args);
	
	}
	
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	  
    
	  
	  @Override public void run(String... args) throws Exception {
		 repositoryRestConfiguration.exposeIdsFor(Produit.class);
		 produitRepository.save(new Produit("Ordinateur DELL", 5667, 5));
		 produitRepository.save(new Produit("Imprimante HP", 6473, 7));
		 produitRepository.save(new Produit("Smart Phone Sumsung S9", 5232, 3));
		
		  produitRepository.findAll().forEach(p ->{
			  //System.out.println(c.getDesignation() + c.getPrice() + c.getQuantite());//since i declared toString() method, let's just use p.toString()
			 System.out.println(p.toString());
		  });
	  }
	 
	 

}
