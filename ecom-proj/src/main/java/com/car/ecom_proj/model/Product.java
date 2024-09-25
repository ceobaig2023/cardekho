package com.car.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
//Entity and Model  are same
//DAO  Repository  Maping DB   Extends JPA  Repository
//DTO   FE sa Responce lata
//
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

   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate releaseDate;  // Use LocalDate for dates
    private boolean isAvailable;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageBytes;

}
