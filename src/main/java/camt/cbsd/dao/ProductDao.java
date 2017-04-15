package camt.cbsd.dao;

import camt.cbsd.entity.Product;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;

public interface ProductDao {
    List<Product> getProducts();
    Product findById(long id);
    Product addProduct(Product product);
}
