package com.caching.springbootrediscaching.controller;

import com.caching.springbootrediscaching.model.Client;
import com.caching.springbootrediscaching.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public Client getClient(@RequestParam(value = "email") String email){
        return clientService.getClient(email);
    }
}
