package com.telusko.SpringBootDemo.service;

import com.telusko.SpringBootDemo.model.Laptop;
import com.telusko.SpringBootDemo.repository.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepo laptopRepo;

    public void addLaptop(Laptop lap) {
//        System.out.printf("laptop added");
        laptopRepo.save(lap);
    }
}
