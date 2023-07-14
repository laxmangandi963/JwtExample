package com.jwt.example.JwtExample3.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class JwtRequest {

    /*
         6) Create JWTRequest and JWTResponse to receive request data and send Login success response.
    */

    private String username;
    private String password;
}
