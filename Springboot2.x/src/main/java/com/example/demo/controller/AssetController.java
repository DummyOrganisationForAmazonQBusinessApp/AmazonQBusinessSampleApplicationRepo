package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Asset;
import com.example.demo.repository.AssetRepository;


@RestController
@RequestMapping("/api/assets")
@CrossOrigin(origins = "http://localhost:4200") // Add this line
public class AssetController {

    private final AssetRepository assetRepository;

    public AssetController(AssetRepository assetRepository) {
        this.assetRepository = assetRepository;
    }

    @GetMapping
    public List<Asset> getAllAssets() {
        return assetRepository.findAll();
    }

    
    @PostMapping
    public Asset createAsset(@RequestBody Asset asset) {
        return assetRepository.save(asset);
    }

    @DeleteMapping("/{id}")
    public void deleteAsset(@PathVariable Long id) {
        assetRepository.deleteById(id);
    }

    //for search logic
  // This method is responsible for searching assets based on different criteria.
@GetMapping("/search")
public List<Asset> searchAssets(@RequestParam String type, @RequestParam String term) {
    // A switch statement is used to handle different search types.
    switch (type) {
        // If the search type is "name", it finds assets by name.
        case "name":
            return assetRepository.findByName(term);
        // If the search type is "id", it finds an asset by id.
        case "location":
            return assetRepository.findByLocation(term);
        // If the search type is "className", it finds assets by class name.
        case "className":
        return assetRepository.findByClassName(term);
        // If the search type is not recognized, an IllegalArgumentException is thrown.
        default:
            throw new IllegalArgumentException("Invalid type: " + type);
    }
}
}

