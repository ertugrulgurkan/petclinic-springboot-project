package com.ertugrul.petclinic.dao.jpa;

import com.ertugrul.petclinic.model.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long>{

}
