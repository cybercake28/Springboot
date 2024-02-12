package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.ProduitDTO;
import com.example.demo.entity.Categorie;
import com.example.demo.entity.Produit;
import com.example.demo.repository.ProduitRepository;


@Service
public class ProduitServiceImpl implements ProduitService {
	@Autowired
	ProduitRepository produitRepository;
	
	/* 
	@Override
	public Produit saveProduit(Produit p) {
		return produitRepository.save(p);
	}
	
	@Override
	public Produit updateProduit(Produit p) {
		return produitRepository.save(p);
	}
	
	@Override
	public void deleteProduit(Produit p) {
		produitRepository.delete(p);
	}
	@Override
	public void deleteProduitById(Long id) {
		produitRepository.deleteById(id);
	}
	@Override
	public Produit getProduit(Long id) {
		return produitRepository.findById(id).get();
	}
	@Override
	public List<Produit> getAllProduits() {
		return produitRepository.findAll();
	}
	
	@Override
	public List<Produit> findByNomProduit(String nom) {
		return produitRepository.findByNomProduit(nom);
	}
	
	@Override
	public List<Produit> findByNomProduitContains(String nom) {
		return produitRepository.findByNomProduitContains(nom);
	}
	
	@Override
	public List<Produit> findByNomPrix(String nom, Double prix) {
		return produitRepository.findByNomPrix(nom, prix);
	}
	
	@Override
	public List<Produit> findByCategorie(Categorie categorie) {
		return produitRepository.findByCategorie(categorie);
	}
	
	@Override
	public List<Produit> findByCategorieIdCat(Long id) {
		return produitRepository.findByCategorieIdCat(id);
	}
	
	@Override
	public List<Produit> findByOrderByNomProduitAsc() {
		return produitRepository.findByOrderByNomProduitAsc();
	}
	
	@Override
	public List<Produit> trierProduitsNomsPrix() {
		return produitRepository.trierProduitsNomsPrix();
	}
	 * */
	

	@Override
	public ProduitDTO getProduit(Long id) {
		return convertEntityToDto( produitRepository.findById(id).get());
	}
	
	@Override
	public ProduitDTO convertEntityToDto(Produit produit) {
		ProduitDTO produitDTO = new ProduitDTO();
		produitDTO.setIdProduit(produit.getIdProduit());
		produitDTO.setNomProduit(produit.getNomProduit());
		produitDTO.setPrixProduit(produit.getPrixProduit());
		produitDTO.setDateCreation(produit.getDateCreation());
		produitDTO.setCategorie(produit.getCategorie());
		return produitDTO;
		/*return ProduitDTO.builder()
	
		.idProduit(produit.getIdProduit())
		.nomProduit(produit.getNomProduit())
		.prixProduit(produit.getPrixProduit())
		.dateCreation(p.getDateCreation())
		.categorie(produit.getCategorie())
		.build();*/
	}


	@Override
	public Produit convertDtoToEntity(ProduitDTO produitDto) {
	
		Produit produit = new Produit();
		produit.setIdProduit(produitDto.getIdProduit());
		produit.setNomProduit(produitDto.getNomProduit());
		produit.setPrixProduit(produitDto.getPrixProduit());
		produit.setDateCreation(produitDto.getDateCreation());
		produit.setCategorie(produitDto.getCategorie());
		return produit;

	}
	
	@Override
	public ProduitDTO saveProduit(ProduitDTO p) {
		return convertEntityToDto( produitRepository.save(convertDtoToEntity(p)));
	}
	
	@Override
	public ProduitDTO updateProduit(ProduitDTO p) {
		return convertEntityToDto(produitRepository.save(convertDtoToEntity(p)));
	}
	
	@Override
	public void deleteProduit(Produit p) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteProduitById(Long id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<ProduitDTO> getAllProduits() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProduitDTO> findByNomProduit(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProduitDTO> findByNomProduitContains(String nom) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProduitDTO> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProduitDTO> findByCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProduitDTO> findByCategorieIdCat(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProduitDTO> findByOrderByNomProduitAsc() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ProduitDTO> trierProduitsNomsPrix() {
		// TODO Auto-generated method stub
		return null;
	}
	
}