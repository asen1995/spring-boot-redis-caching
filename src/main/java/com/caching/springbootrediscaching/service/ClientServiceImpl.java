package com.caching.springbootrediscaching.service;

import com.caching.springbootrediscaching.model.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ClientServiceImpl implements ClientService {

    private static final Logger logger = LogManager.getLogger(ClientServiceImpl.class);


    @Override
    @Cacheable("email")
    public Client getClient(String email) {

        Client client = new Client();
        client.setName("John Doe");
        client.setEmail(email);
        client.setPhone("1234567890");

        client.setCountry("USA");
        client.setState("NY");
        client.setZipCode("12345");
        client.setAddress("123 Main St");
        client.setCity("New York");
        client.setSalary(new BigDecimal(100000));

        logger.info("Client with email: {} not found in cache. Returning from method.", email);

        return client;
    }
}
