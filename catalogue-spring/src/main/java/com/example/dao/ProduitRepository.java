package com.example.dao;

 
 
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.entities.Produit;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
 
	@RestResource(path="/byDesignation") //this allows us to access this method via API
	public List<Produit> findByDesignationContains(@Param("mc") String mc);
	
	//instead of returning all the list which might be tedious , lets work with Pagination is much better when u want specific data
	@RestResource(path="/byDesignationPage")
	public Page<Produit> findByDesignationContains(@Param("mc") String mc,Pageable pageable);
	
	//so imagine i want return only price !!! 
	//for that we gonna create class with @Projection
	
	//@Query("select c from Produit c where c.nom like :x")
	//public Page<Produit> search(@Param("x") String mc, Pageable pageable);
}
