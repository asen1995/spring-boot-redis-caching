package com.caching.springbootrediscaching.service;

import com.caching.springbootrediscaching.model.Client;

public interface ClientService {
    Client getClient(String email);
}
