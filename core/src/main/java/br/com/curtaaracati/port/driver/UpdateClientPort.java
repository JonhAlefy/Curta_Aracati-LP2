package br.com.curtaaracati.port.driver;

import br.com.curtaaracati.domain.Client;

public interface UpdateClientPort {

    Client execute(String id, Client client);

}
