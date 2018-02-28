package com.advertise.repository;

import com.advertise.model.Advertise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdvertiseRepository extends JpaRepository<Advertise, String> {
}
