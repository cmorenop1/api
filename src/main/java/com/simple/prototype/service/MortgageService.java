package com.simple.prototype.service;

import com.simple.prototype.dao.MortgageRepository;
import com.simple.prototype.entity.Mortgage;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for Mortgage-related operations.
 * This service communicates with the database via the MortgageRepository.
 */
@Service
public class MortgageService implements IMortgageService {

    // Repository instance for interacting with the database.
    private final MortgageRepository mortgageRepository;

    /**
     * Constructor that initializes the MortgageRepository.
     *
     * @param mortgageRepository the repository to interact with the database.
     */
    @Autowired
    public MortgageService(MortgageRepository mortgageRepository) {
        this.mortgageRepository = mortgageRepository;
    }

    /**
     * Fetches all the Mortgages from the database.
     *
     * @return a list of all Mortgages.
     */
    @Override
    public List<Mortgage> findAll() {
        return mortgageRepository.findAll();
    }

    /**
     * Finds a specific Mortgage by its ID.
     *
     * @param mortgage_id the ID of the Mortgage to be retrieved.
     * @return the Mortgage entity.
     * @throws RuntimeException if the Mortgage with the given ID doesn't exist.
     */
    @Override
    public Mortgage findById(int mortgage_id) {
        // Optional is a container that may or may not contain a non-null value.
        // More info: https://www.baeldung.com/java-optional
        return mortgageRepository
                .findById(mortgage_id)
                .orElseThrow(() -> new RuntimeException("NOT_FOUND > mortgage_id: " + mortgage_id));
    }

    /**
     * Saves a Mortgage entity to the database.
     *
     * @param mortgage the Mortgage entity to be saved.
     * @return the saved Mortgage entity.
     */
    @Override
    public Mortgage save(Mortgage mortgage) {
        System.out.println("➡\uFE0F SAVING: " + mortgage);
        return mortgageRepository.save(mortgage);
    }

    /**
     * Deletes a Mortgage from the database by its ID.
     *
     * @param mortgage_id the ID of the Mortgage to be deleted.
     * @return a message indicating the successful deletion.
     * @throws RuntimeException if the Mortgage with the given ID doesn't exist.
     */
    @Transactional
    @Override
    public String deleteById(int mortgage_id) {
        if (mortgageRepository.findById(mortgage_id).isEmpty()) {
            throw new RuntimeException("NOT_FOUND > mortgage_id: " + mortgage_id);
        }
        mortgageRepository.deleteById(mortgage_id);
        System.out.println("➡\uFE0F DELETED > mortgage_id: " + mortgage_id);
        return "DELETED > mortgage_id: " + mortgage_id;
    }
}
