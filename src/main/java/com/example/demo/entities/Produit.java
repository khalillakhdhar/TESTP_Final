package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.lang.NonNull;

import com.sun.istack.NotNull;

@Entity
public class Produit {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
@NotBlank
private String titre;
@Min(1)
@NotNull
private float prixu;
@Min(1)
@NonNull
private float prixv;
@Column(nullable = false)
private int quantite;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public float getPrixu() {
	return prixu;
}
public void setPrixu(float prixu) {
	this.prixu = prixu;
}
public float getPrixv() {
	return prixv;
}
public void setPrixv(float prixv) {
	this.prixv = prixv;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}



}
