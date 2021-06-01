package com.vdubyk.cursorhomework19.service;

import com.vdubyk.cursorhomework19.model.Laptop;
import com.vdubyk.cursorhomework19.repository.LaptopRepositiry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepositiry laptopRepositiry;

    public List<Laptop> getAlllaptops() {
        return laptopRepositiry.findAll();
    }

    public void save(Laptop laptop) {
        laptopRepositiry.save(laptop);
    }

    public List<Laptop> getAllSortedNameManufactures() {
        return laptopRepositiry.findLaptopByOrderByManufacturerDesc();
    }

    public List<Laptop> getLaptopsWithMemoryGreaterThan() {
        return laptopRepositiry.findLaptopByMemoryGreaterThanEqual(16);
    }

    public List<Laptop> getLaptopsUsed() {
        return laptopRepositiry.findLaptopByUsedEquals(true);
    }
}
