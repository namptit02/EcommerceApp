package org.example.userservice.dto.request;

import jakarta.persistence.Column;
import lombok.Data;
@Data
public class RegisterDTO {
    @Column(unique = true)
    private String username;
//    @JsonIgnore
    private String password;
    private String email;
    private String confirmPassword;
}
