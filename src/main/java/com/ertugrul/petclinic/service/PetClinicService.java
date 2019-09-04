package com.ertugrul.petclinic.service;

import java.util.List;

import com.ertugrul.petclinic.exception.OwnerNotFoundException;
import com.ertugrul.petclinic.exception.VetNotFoundException;
import com.ertugrul.petclinic.model.Owner;
import com.ertugrul.petclinic.model.Vet;

import javax.validation.Valid;

public interface PetClinicService {
	List<Owner> findOwners();
	List<Owner> findOwners(String lastName);
	Owner findOwner(Long id) throws OwnerNotFoundException;
	void createOwner(@Valid Owner owner);
	void updateOwner(Owner owner);
	void deleteOwner(Long id);
	List<Vet> findVets();
	Vet findVet(Long id) throws VetNotFoundException;
}
