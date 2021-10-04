package com.example.SpringDataRest.dao;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.SpringDataRest.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens",path ="aliens")
public interface AlienJPARepository extends JpaRepository<Alien, Integer>{


}
