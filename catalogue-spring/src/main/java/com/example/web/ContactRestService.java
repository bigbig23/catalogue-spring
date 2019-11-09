 package com.example.web;

import java.util.List;
import java.util.Optional;

 
/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.ContactRepository;
import com.example.entities.Contact;
 

@RestController
@CrossOrigin("*")
@RequestMapping("/app")
public class ContactRestService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@RequestMapping(value="/contacts", method=RequestMethod.GET)
	public List<Contact> getContacts(){
		return (List<Contact>) contactRepository.findAll();
	}
	
	@RequestMapping(value="/contacts/{id}", method=RequestMethod.GET)
	public Optional<Contact> getContactById(@PathVariable Long id) {
		return contactRepository.findById(id);
	}
	
	@RequestMapping(value="/contacts", method=RequestMethod.POST)
	public Contact saveContact(@RequestBody Contact c) {
		return contactRepository.save(c);
	}
	
	
	  @RequestMapping(value = "/contacts/{id}", method = RequestMethod.DELETE) 
	  public boolean deleteContact(@PathVariable Long id) {
		  contactRepository.deleteById(id);
		  return true;
	  }
	  
	  
	  @RequestMapping(value="/contacts{id}", method=RequestMethod.PUT)
		public Contact updateContact(@PathVariable Long id, @RequestBody Contact c) {
		  c.setId(id);  
		return contactRepository.save(c);
		}
		
	 
	  //method search
	  @GetMapping("/contacts/searchContact")
	  public Page<Contact> searchContact(
			  @RequestParam(name="mc",defaultValue="") String mc,
			  @RequestParam(name="page",defaultValue="0") int page,
			  @RequestParam(name="size",defaultValue="5") int size
			  ){
		  return  contactRepository.search("%"+mc+"%", new PageRequest(page,size));
		  
	  }
	 
 
}


*/
