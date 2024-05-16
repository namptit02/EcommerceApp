package org.example.userservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String streetAddress;
    private String city;
    private String zipcode;
    private String state;
    private boolean makePrimary;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
