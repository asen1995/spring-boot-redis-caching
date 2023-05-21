package com.caching.springbootrediscaching.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Builder
public class Client implements Serializable {

    private String name;
    private String email;
    private String phone;

    private String address;
    private String city;
    private String state;
    private String zipCode;

    private String country;
    private BigDecimal salary;
}
