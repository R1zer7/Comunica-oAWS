package com.eventostech.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eventostech.api.domain.coupon.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, UUID>{}  
    

