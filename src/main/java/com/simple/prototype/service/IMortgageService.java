package com.simple.prototype.service;

import com.simple.prototype.entity.Mortgage;

import java.util.List;

public interface IMortgageService {
    /*
CRUD to HTTP Method to Java Method:
    CREATE:
        HTTP Method: POST
        Java Method(s):
        ✨ repository.save(entity) – Used for creating a new entity.
    READ:
        HTTP Method: GET
        Java Method(s):
        ✨ repository.findById(id) – Used for fetching an entity by its ID.
        ✨ repository.findAll() – Used for fetching all entities.
    UPDATE:
        HTTP Method: PUT (full update) or PATCH (partial update)
        Java Method(s):
        ✨ repository.save(entity)
        Yes, the same save method as in ⭐️ CREATE ⭐️. In the context of JPA,
        if the entity has an ID that already exists in the database,
        save acts like an update rather than an insert.
    DELETE:
        HTTP Method: DELETE
        Java Method(s):
        ✨ repository.deleteById(id) – Used for deleting an entity by its ID.
 */

    Mortgage findById(int mortgage_id);
    List<Mortgage> findAll();

    Mortgage save(Mortgage mortgage);

    String deleteById(int mortgage_id);
}
