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


        Client client = Client.builder()
                .name("John Doe")
                .email(email)
                .phone("1234567890")
                .country("USA")
                .state("NY")
                .zipCode("12345")
                .address("123 Main St")
                .city("New York")
                .salary(new BigDecimal(100000)).build();

        logger.info("Client with email: {} not found in cache. Returning from method.", email);

        return client;
    }
}
