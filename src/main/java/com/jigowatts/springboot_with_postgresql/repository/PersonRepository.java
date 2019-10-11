package com.jigowatts.springboot_with_postgresql.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jigowatts.springboot_with_postgresql.domain.Person;
/**
 * PersonRepository
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    public Person findByName(String name);
}