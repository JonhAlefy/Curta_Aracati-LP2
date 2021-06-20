package br.com.curtaaracati.userstories;

import br.com.curtaaracati.domain.Client;
import br.com.curtaaracati.port.driven.ClientRepositoryPort;
import br.com.curtaaracati.port.driver.CreateClientPort;
import br.com.curtaaracati.util.GenerateTokens;
import lombok.RequiredArgsConstructor;

import javax.inject.Named;
import java.security.SecureRandom;
import java.util.UUID;

@Named
@RequiredArgsConstructor
public class CreateClientUS implements CreateClientPort {

    private final ClientRepositoryPort repository;


    @Override
    public Client execute(Client client) {

        if(repository.existsByEmail(client.getEmail())){
            throw new IllegalArgumentException("Email já existe");
        }

        client.setToken(GenerateTokens.execute(6));


        return repository.save(client);

    }

}
