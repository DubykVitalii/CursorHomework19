package com.vdubyk.cursorhomework19.repository;

import com.vdubyk.cursorhomework19.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LaptopRepositiry extends JpaRepository<Laptop, Long> {

    List<Laptop> findLaptopByOrderByManufacturerDesc();

    List<Laptop> findLaptopByMemoryGreaterThanEqual(int memory);

    List<Laptop> findLaptopByUsedEquals(boolean used);
}
