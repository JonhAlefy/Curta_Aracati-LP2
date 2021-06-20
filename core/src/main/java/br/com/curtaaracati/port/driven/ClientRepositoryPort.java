package br.com.curtaaracati.port.driven;

import br.com.curtaaracati.domain.Client;

public interface ClientRepositoryPort {

    Client save(Client client);

    boolean existsByEmail(String email);

    Client findByClientValue(String value);



}
