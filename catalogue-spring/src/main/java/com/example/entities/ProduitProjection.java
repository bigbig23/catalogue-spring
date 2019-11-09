package com.example.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1",types = Produit.class)
public interface ProduitProjection {
	
	
	public double getPrice();
	//type in api http://localhost:8080/produits?projection=P1
	//this brings list with only the price
	
	public String getDesignation();

}
