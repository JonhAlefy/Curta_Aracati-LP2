package br.com.curtaaracati;

import br.com.curtaaracati.domain.Client;
import br.com.curtaaracati.port.driven.ClientRepositoryPort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String>, ClientRepositoryPort {

}
