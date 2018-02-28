package com.advertise.resource;


import com.advertise.model.Advertise;
import com.advertise.repository.AdvertiseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/advertise")
public class AdvertiseResource {

    @Autowired
    AdvertiseRepository repository;

    @GetMapping("/all")
    public List<Advertise> getAll() {
        return repository.findAll();
    }
}
