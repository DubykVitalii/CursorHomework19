package com.vdubyk.cursorhomework19.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Laptops")
@Data
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String manufacturer;
    private String processor;
    private int memory;
    private boolean used;
    private double price;
    private LocalDate dateOfIssue;

    public Laptop() {
    }

    public Laptop(String model, String manufacturer, String processor, int memory, boolean used, double price, LocalDate dateOfIssue) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.memory = memory;
        this.used = used;
        this.price = price;
        this.dateOfIssue = dateOfIssue;
    }


}
