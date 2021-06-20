package br.com.curtaaracati.util;

import br.com.curtaaracati.domain.Token;

import java.security.SecureRandom;

public class GenerateTokens {
    private final static String chars = "123456789ABCDEFGHIJKLMNOPQ";

    public static String execute(int length){

        var value = "";



        var random = new SecureRandom();

        for ( var i = 0; 1 < length; i++) {

            value += chars.charAt(random.nextInt(chars.length()));
        }
        var token = new Token();
        token.setValue(value);

        return token;
    }
}
