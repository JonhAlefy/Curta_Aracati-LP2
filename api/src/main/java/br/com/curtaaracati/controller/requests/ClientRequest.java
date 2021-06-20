package br.com.curtaaracati.controller.requests;

import br.com.curtaaracati.domain.Client;
import lombok.Value;

@Value
public class ClientRequest {

    private String name;
    private String password;
    private String email;

    public Client toClient(){

        var client = new Client();

        client.setName(name);
        client.setPassword(password);
        client.setEmail(email);

        return client;

    }

}
