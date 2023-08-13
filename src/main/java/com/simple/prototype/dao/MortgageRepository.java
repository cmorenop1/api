package com.simple.prototype.dao;

import com.simple.prototype.entity.Mortgage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Data access object (DAO) for the Mortgage entity.
 * This interface provides CRUD operations for the Mortgage entity by extending the JpaRepository.
 * <p>
 * The @RepositoryRestResource annotation means this repository will be exposed as a RESTful service
 * with the given path. Clients can interact with the Mortgage data through this service.
 */
@RepositoryRestResource(path = "mortgages")
public interface MortgageRepository extends JpaRepository<Mortgage, Integer> {
    //🔥 SPRING-DATA-JPA
    //🔥 NO NEED OF HARD-CODED-SQL-QUERY
}
