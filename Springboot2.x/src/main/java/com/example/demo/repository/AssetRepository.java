package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Asset;

public interface AssetRepository extends JpaRepository<Asset, Long> {

    @Query("SELECT a FROM Asset a WHERE LOWER(a.name) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Asset> findByName(@Param("name") String name);

    @Query("SELECT a FROM Asset a WHERE LOWER(a.location) LIKE LOWER(CONCAT('%', :location, '%'))")
    List<Asset> findByLocation(@Param("location") String location);

    @Query("SELECT a FROM Asset a WHERE LOWER(a.className) LIKE LOWER(CONCAT('%', :className, '%'))")
    List<Asset> findByClassName(@Param("className") String className);
}