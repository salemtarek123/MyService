package com.example.demo.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Produit;

public interface IProduitRepository extends MongoRepository <Produit, Long> {
	
		

}
