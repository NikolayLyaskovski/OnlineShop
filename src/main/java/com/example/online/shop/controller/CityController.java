package com.example.online.shop.controller;


import com.example.online.shop.model.City;
import com.example.online.shop.service.CityService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cities")
public class CityController {

    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @PostMapping
    public void createCity(@RequestBody City city){

    }

    @PutMapping
    public void updateCity(@RequestBody City city){

    }

    @GetMapping("/{cityId}")
    public City city(){
        return  null;
    }

    @DeleteMapping
    public void deleteCity(@PathVariable Long cityId){

    }

}
