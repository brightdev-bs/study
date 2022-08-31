package com.vanille.restapipractice.rest_jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByLastName(@Param("name") String name);
}
