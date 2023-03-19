package kodlama.io.rentacar.api.controllers;

import kodlama.io.rentacar.business.abstracts.BrandService;
import kodlama.io.rentacar.entities.concretes.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandsCotrollers {
    private BrandService service;

    public BrandsCotrollers(BrandService service) {
        this.service = service;
    }

    @GetMapping("/brands")
    public List<Brand> getAll() {
        return service.getAll();
    }
}
