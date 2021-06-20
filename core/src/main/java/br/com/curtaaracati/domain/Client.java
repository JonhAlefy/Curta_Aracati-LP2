package br.com.curtaaracati.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Indexed;


@Getter
@Setter
@Document

public class Client {
    private String id;
    private String name;
    private String password;
    private String email;
    private String token;
    private boolean enabled;


}




