package com.example.online.shop.service;

import com.example.online.shop.model.City;
import org.springframework.stereotype.Service;

@Service
public interface CityService {
    void createCity(City city);
    void getCity(Long cityId);
    void getAllCity();
    void deleteCity(Long cityId);
    void updateCity(City city);

}
