package com.luke.petshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luke.petshop.domain.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

}
