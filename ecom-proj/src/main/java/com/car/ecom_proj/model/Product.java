package com.car.ecom_proj.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generate the ID
    private int id;

    private String name;
    private String description;
    private String brand;
    private int quantity;
    private BigDecimal price;
    private String category;
    private String image;
    private LocalDate releaseDate;  // Use LocalDate for dates
    private boolean isAvailable;

}
