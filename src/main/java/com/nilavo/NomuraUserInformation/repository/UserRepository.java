package com.nilavo.NomuraUserInformation.repository;

import com.nilavo.NomuraUserInformation.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person,Integer> {
}
