package com.example.festivalfood.foodtruck.domain;

import com.example.festivalfood.menu.domain.Menu;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class FoodTruck {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "foodTruck", fetch = FetchType.LAZY)
    private List<Menu> menus = new ArrayList<>();

    public FoodTruck(String name) {
        this.name = name;
    }
}