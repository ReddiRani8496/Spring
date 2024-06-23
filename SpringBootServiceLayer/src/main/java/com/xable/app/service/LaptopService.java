package com.xable.app.service;

import com.xable.app.repo.LaptopRepository;
import com.xable.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap){
        System.out.println("adding laptop");
        repo.save(lap);
    }

    public boolean isGoodForProgramming(Laptop lap){
        return true;
    }
}
