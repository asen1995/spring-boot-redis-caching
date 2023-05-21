package com.caching.springbootrediscaching.service;

import com.caching.springbootrediscaching.model.Client;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {


    @Override
    @Cacheable("email")
    public Client getClient(String email) {

        Client client = new Client();
        client.setName("John Doe");
        client.setEmail(email);
        client.setPhone("1234567890");

        return client;
    }
}
