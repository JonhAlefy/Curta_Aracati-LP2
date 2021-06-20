package br.com.curtaaracati.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter

public class Token {

    private String value;
    private LocalDateTime expireAt;

    public Token(){
        this.expireAt = LocalDateTime.now().plusSeconds(20);
    }

    public boolean hasExpired(){
        return expireAt.isAfter(LocalDateTime.now());

    }

    public boolean notHasExpired(){
        return !hasExpired();
    }
}
