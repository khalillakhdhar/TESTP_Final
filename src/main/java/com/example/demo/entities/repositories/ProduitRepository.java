package com.example.demo.entities.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Produit;

public interface ProduitRepository extends CrudRepository<Produit, Long> {

}
