 package com.example.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ProduitRepository;
import com.example.entities.Produit;
 
 

@RestController
@CrossOrigin("*")
//@RequestMapping("/app")
public class ProduitRestServices {
	//sometimes is not enough to do all method with spring data rest, so it's better to create a class with RestControll 
	//to define all that is not possible with spring data rest
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping("/listProduits") ///to avoid confusion with data rest bcoz it has already a api with produits, it's better using a different api name
	public List<Produit> getProduits(){
		return produitRepository.findAll();
	}
	
	@GetMapping("/listProduits/{id}") 
	public Produit findById(@PathVariable Long id){
		return produitRepository.findById(id).get();
	}
	
	
	@PutMapping("/listProduits/{id}") 
	public Produit updateProduit(@PathVariable Long id, @RequestBody Produit p){
		p.setId(id);
		return produitRepository.save(p);
	}
	
	@PostMapping("/listProduits") 
	public Produit addProduit(@RequestBody Produit p){
		return produitRepository.save(p);
	}
	
	
	@DeleteMapping("/listProduits/{id}") 
	public void deleteProduit(@PathVariable Long id){
		produitRepository.deleteById(id);
	}

 		
	 /*
	  //method search
	  @GetMapping("/contacts/searchContact")
	  public Page<Produit> searchContact(
			  @RequestParam(name="mc",defaultValue="") String mc,
			  @RequestParam(name="page",defaultValue="0") int page,
			  @RequestParam(name="size",defaultValue="5") int size
			  ){
		  return  produitRepository.search("%"+mc+"%", new PageRequest(page,size));
		  
	  }
	  */
	 
 
}



