package com.baeldung.spring.security.x509;

import io.jsonwebtoken.Jwts;

import java.util.Date;

public class TokenHelper {

    public static String generateToken(String username) {
        String audience = "web";
        String s =  Jwts.builder()
                .setIssuer( "RBAC Demo" )
                .setSubject("tester")
                .setAudience(audience)
                .setIssuedAt(new Date())
                .setExpiration(new Date(new Date().getTime() + 600*100))
                //.signWith( SIGNATURE_ALGORITHM, SECRET )
            //    .signWith(getPrivateKey())
                .compact();
        System.out.println("Using private key and generated AccessToken: " + s  + "\n");
        return s;
    }
}
