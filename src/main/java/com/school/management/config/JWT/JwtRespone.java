package com.school.management.config.JWT;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwtRespone
{
    private String token;

    public JwtRespone(String token) {
        this.token = token;
    }
}
