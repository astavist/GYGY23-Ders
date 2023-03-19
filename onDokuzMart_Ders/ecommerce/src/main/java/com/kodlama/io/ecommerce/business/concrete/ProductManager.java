package com.kodlama.io.ecommerce.business.concrete;

import com.kodlama.io.ecommerce.business.abstracts.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductManager implements ProductService {
    Private ProductRepository repository;
}
