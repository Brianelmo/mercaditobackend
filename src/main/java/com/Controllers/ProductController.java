package com.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entities.Product;
import com.Repositories.ProductRepositorie;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    private final ProductRepositorie productRepositorie;

    public ProductController(ProductRepositorie productRepositorie){
        this.productRepositorie = productRepositorie;
    }
    

    @GetMapping
    public List<Product> getProducts(){
        return productRepositorie.findAll();
    }
}
