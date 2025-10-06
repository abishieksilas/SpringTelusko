package com.telusko.SpringBootDemo.repository;

import com.telusko.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepo {

    public void save(Laptop lap) {
        System.out.printf("Saved successfully in DB...");
    }
}
