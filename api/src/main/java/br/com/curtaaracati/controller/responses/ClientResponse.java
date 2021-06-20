package br.com.curtaaracati.controller.responses;

import br.com.curtaaracati.domain.Client;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;

@Getter

public class ClientResponse {
    private String id;

    public ClientResponse(Client client) {
        this.id = client.getId();
    }


}
