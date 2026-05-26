package com.example.festivalfood.menu.domain;

import com.example.festivalfood.foodtruck.domain.FoodTruck;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "food_truck_id")
    private FoodTruck foodTruck;

    public Menu(String name, int price, FoodTruck foodTruck) {
        this.name = name;
        this.price = price;
        this.foodTruck = foodTruck;
    }
}