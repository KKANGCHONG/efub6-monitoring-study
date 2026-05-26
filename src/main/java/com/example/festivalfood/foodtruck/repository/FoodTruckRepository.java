package com.example.festivalfood.foodtruck.repository;

import com.example.festivalfood.foodtruck.domain.FoodTruck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTruckRepository extends JpaRepository<FoodTruck, Long> {
}