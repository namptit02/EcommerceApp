package org.example.userservice.dto.request;

import lombok.Data;

@Data
public class AuthenticateDTO {
    private String email;
    private String password;
}
