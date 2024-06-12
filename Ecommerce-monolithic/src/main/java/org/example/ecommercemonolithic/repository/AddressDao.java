package org.example.ecommercemonolithic.repository;


import org.example.ecommercemonolithic.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDao extends JpaRepository<Address, Integer> {

}
