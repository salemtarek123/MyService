package com.example.demo.entities;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document 
public class Produit implements Serializable {

    @Id
  
    private Long id;
    private String designation;
    private double prix;

    protected Produit() {}

    public Produit(String designation) {
        this.designation = designation;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
}

