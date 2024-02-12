package com.example.demo.services;

import java.util.List;

import com.example.demo.DTO.ProduitDTO;
import com.example.demo.entity.Categorie;
import com.example.demo.entity.Produit;


public interface ProduitService {
	/*
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	*/
	ProduitDTO saveProduit(ProduitDTO produit);
	ProduitDTO updateProduit(ProduitDTO produit);
	void deleteProduit(Produit p);
	void deleteProduitById(Long id);
	ProduitDTO getProduit(Long id);
	List<ProduitDTO> getAllProduits();
	List<ProduitDTO> findByNomProduit(String nom);
	List<ProduitDTO> findByNomProduitContains(String nom);
	List<ProduitDTO> findByNomPrix (String nom, Double prix);
	List<ProduitDTO> findByCategorie (Categorie categorie);
	List<ProduitDTO> findByCategorieIdCat(Long id);
	List<ProduitDTO> findByOrderByNomProduitAsc();
	List<ProduitDTO> trierProduitsNomsPrix();
	ProduitDTO convertEntityToDto (Produit produit);
	Produit convertDtoToEntity(ProduitDTO produitDto);
}