package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import javax.validation.Valid;

import com.example.demo.entities.Produit;
import com.example.demo.entities.repositories.ProduitRepository;

@RestController
@RequestMapping("produit")
public class ProduitController {
@Autowired
ProduitRepository produitRepository;
@GetMapping
public List<Produit>getListProduit()
{
	return (List<Produit>) produitRepository.findAll();
}
@PostMapping
public Produit createProduct(@Valid @RequestBody Produit produit)
{
return produitRepository.save(produit);
}
}
