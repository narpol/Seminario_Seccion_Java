package com.example.demo.domain.model.gateways;

import com.example.demo.domain.model.Client;

public interface ClientRepository {
    Client saveClient(Client client);
}
