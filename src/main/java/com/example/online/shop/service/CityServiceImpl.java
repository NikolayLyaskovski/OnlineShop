package com.example.online.shop.service;

import com.example.online.shop.model.City;
import com.example.online.shop.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }



    @Override
    public void createCity(City city) {

    }

    @Override
    public void getCity(Long cityId) {

    }

    @Override
    public void getAllCity() {

    }

    @Override
    public void deleteCity(Long cityId) {

    }

    @Override
    public void updateCity(City city) {

    }
}
