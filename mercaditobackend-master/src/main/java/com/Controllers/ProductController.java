package com.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Entities.Product;
import com.Repositories.ProductRepositorie;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
        RequestMethod.DELETE })
public class ProductController {

    private final ProductRepositorie productRepositorie;

    public ProductController(ProductRepositorie productRepositorie) {
        this.productRepositorie = productRepositorie;
    }

    @GetMapping
    public List<Product> getProducts() {
        return productRepositorie.findAll();
    }

    @PostMapping
    public ResponseEntity<List<Product>> PostProduct(@RequestBody List<Product> products) {

        try {
            List<Product> newProduct = productRepositorie.saveAll(products);
            return ResponseEntity.ok(newProduct);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }

    }

}
