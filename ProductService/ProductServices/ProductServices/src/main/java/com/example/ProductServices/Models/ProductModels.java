package com.example.ProductServices.Models;

// import jakarta.persistence.*;
// import lombok.Data;
// import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductModels {
    private int id;
    private String title;
    private double price;
    private String description;
    private String image;
    private CategoryModel category;
    // @ManyToOne(cascade = CascadeType.PERSIST)
    // @JoinColumn
    private int qty;
    private int numberOfOrders;
}
