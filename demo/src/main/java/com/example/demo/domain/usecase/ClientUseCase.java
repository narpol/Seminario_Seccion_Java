package com.example.demo.domain.usecase;

import com.example.demo.domain.model.Client;
import com.example.demo.domain.model.gateways.ClientRepository;

public class ClientUseCase {

    private final ClientRepository clientRepository;

    public ClientUseCase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client createClient(Client client){
        return clientRepository.saveClient(client);
    }

}
