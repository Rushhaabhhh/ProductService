package com.example.ProductServices.Models;

// import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Producer;

@Getter
@Setter

public class CategoryModel extends BaseModel {


    private int id;
    private String title;
    private String description; 
    // @OneToMany(mappedBy = "category") // (fetch = FetchType.EAGER)
    private List<Producer> products;
}
