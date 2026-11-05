package com.eventostech.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostech.api.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID> {
    
}
