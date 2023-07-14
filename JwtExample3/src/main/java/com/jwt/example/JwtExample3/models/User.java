package com.jwt.example.JwtExample3.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {

    private String userId;

    private String name;

    private String email;
}
