package com.xable.app.repo;

import com.xable.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("Saved in database");
    }
}
