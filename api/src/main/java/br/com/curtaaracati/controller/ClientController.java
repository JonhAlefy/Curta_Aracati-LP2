package br.com.curtaaracati.controller;


import br.com.curtaaracati.controller.requests.ClientRequest;
import br.com.curtaaracati.controller.responses.ClientResponse;
import br.com.curtaaracati.domain.Client;
import br.com.curtaaracati.port.driver.CreateClientPort;
import br.com.curtaaracati.port.driver.EnabledClientByTokenPort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/clients")
@RestController
@RequiredArgsConstructor


public class ClientController {

    private final CreateClientPort createClientPort;
    private final EnabledClientByTokenPort

    @PostMapping
    public ClientResponse post(@RequestBody ClientRequest request){

        var client = createClientPort.execute(request.toClient());
        return new ClientResponse(client);

    }

    @PatchMapping("check-by")
    public void checkByToken(@RequestParam String token){
        enabledClientByTokenPort.execute(token);

    }
}
