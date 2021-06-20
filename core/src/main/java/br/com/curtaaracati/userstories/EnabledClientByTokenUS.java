package br.com.curtaaracati.userstories;


import br.com.curtaaracati.port.driven.ClientRepositoryPort;
import br.com.curtaaracati.port.driver.EnabledClientByTokenPort;
import lombok.RequiredArgsConstructor;

import javax.inject.Named;

@Named
@RequiredArgsConstructor
public class EnabledClientByTokenUS implements EnabledClientByTokenPort {

    private final ClientRepositoryPort repository;

    @Override
    public void execute(String token){

        var client = repository.findByClientValue(token);

        if (client != null && client.getToken().notHasExpired()){
            client.setEnabled(true);
            client.setToken(null);

        }

        repository.save(client);

    }

}
