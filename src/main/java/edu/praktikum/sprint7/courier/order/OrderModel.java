package edu.praktikum.sprint7.courier.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
public class OrderModel {
    private String firstName;
    private String lastName;
    private String address;
    private String metroStation;
    private String phone;
    private String rentTime;
    private String deliveryDate;
    private String comment;
    private List<String> colour;

    public OrderModel(List<String> colour) {
        this.firstName = "Chuck";
        this.lastName = "Norris";
        this.address = "LowKick str., 69";
        this.metroStation = "ChuckStation";
        this.phone = "+1696661315";
        this.rentTime = "7";
        this.deliveryDate = "2023-03-23";
        this.comment = "Chuck Norris writes code that optimizes itself.";
        this.colour = colour;
    }
}

