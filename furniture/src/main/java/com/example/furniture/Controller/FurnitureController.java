package com.example.furniture.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.furniture.model.Furniture;
import com.example.furniture.repository.FurnitureRepo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class FurnitureController {
    @Autowired
    FurnitureRepo repo;
    @GetMapping("/Furniture")
    public List<Furniture> getAllFurnitures()
    {
        List<Furniture> furnitures =repo.findAll();
        return furnitures;
    }
    @GetMapping("/Furniture/{id}")
    public Furniture getAccount(@PathVariable int id)
    {
        Furniture furnitures= repo.findById(id).get();
        return furnitures;
    }
    @PostMapping("/Furniture/add")
    public void createAccount(@RequestBody Furniture furnitures)
    {
        repo.save(furnitures);
    }
    @PutMapping("/Furniture/update/{id}")
    public void updateAccount(@PathVariable int id)
    {
        Furniture furnitures = repo.findById(id).get();
        furnitures.setProduct_name("San@");
        furnitures.setProduct_Category("Dining Table");
        furnitures.setProduct_Cost(10000);
        repo.save(furnitures);
    }
    @DeleteMapping("/Furniture/delete/{id}")
    public void deleteAccount(@PathVariable int id)
    {
        Furniture furnitures = repo.findById(id).get();
        repo.delete(furnitures);
    }
}
