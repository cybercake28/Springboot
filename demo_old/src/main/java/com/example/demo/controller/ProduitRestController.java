package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.ProduitDTO;
import com.example.demo.entity.Produit; 
import com.example.demo.services.ProduitService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRestController {
	@Autowired
	ProduitService produitService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<ProduitDTO> getAllProduits() {
		return produitService.getAllProduits();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET) 
	public ProduitDTO getProduitById(@PathVariable("id") Long id) {
		return produitService.getProduit(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ProduitDTO createProduit(@RequestBody ProduitDTO produit) { 
		return produitService.saveProduit(produit);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public ProduitDTO updateProduit(@RequestBody ProduitDTO produit){ 
		return produitService.updateProduit(produit);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id) {
		produitService.deleteProduitById(id);
	}
	
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<ProduitDTO> getProduitsByCatId(@PathVariable("idCat") Long idCat) { 
		return produitService.findByCategorieIdCat(idCat);
	}
	
}