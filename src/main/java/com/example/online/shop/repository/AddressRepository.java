package com.example.online.shop.repository;

import com.example.online.shop.model.Address;
import com.example.online.shop.service.AddressServiceImpl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
}

