package com.example.furniture.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.furniture.model.Furniture;

public interface FurnitureRepo extends JpaRepository<Furniture,Integer>{

    
}
