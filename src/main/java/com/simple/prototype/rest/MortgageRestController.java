package com.simple.prototype.rest;

import com.simple.prototype.entity.Mortgage;
import com.simple.prototype.service.MortgageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing Mortgage-related operations.
 * This controller handles HTTP requests to perform CRUD operations on Mortgages.
 */
@RestController
@RequestMapping("/mortgages")
public class MortgageRestController {

    // Service instance to perform Mortgage-related business logic.
    private final MortgageService mortgageService;

    /**
     * Constructor that initializes the MortgageService.
     *
     * @param mortgageService the service for performing Mortgage-related operations.
     */
    @Autowired
    public MortgageRestController(MortgageService mortgageService) {
        this.mortgageService = mortgageService;
    }

    /**
     * Fetches all the Mortgages from the database.
     *
     * @return a list of all Mortgages.
     */
    @GetMapping
    public List<Mortgage> getMortgages() {
        return mortgageService.findAll();
    }

    /**
     * Retrieves a specific Mortgage by its ID.
     *
     * @param mortgage_id the ID of the Mortgage to be retrieved.
     * @return the Mortgage entity.
     */
    @GetMapping("/{mortgage_id}")

    public Mortgage getMortgageById(@PathVariable int mortgage_id) {
        return mortgageService.findById(mortgage_id);
    }

    /**
     * Adds a new Mortgage to the database.
     *
     * @param mortgage the Mortgage entity to be added.
     * @return the saved Mortgage entity.
     * Note: The comment indicates a decision to not manually set the ID. This means
     * it relies on the database or ORM to auto-generate it.
     */
    @PostMapping
    public Mortgage addMortgage(@RequestBody Mortgage mortgage) {
        //🔥 I am going to ignore the ->> employee.setId(0); to see what happens ...
        return mortgageService.save(mortgage);
    }

    /**
     * Updates an existing Mortgage in the database.
     *
     * @param mortgage the Mortgage entity with updated details.
     * @return the updated Mortgage entity.
     */
    @PutMapping
    public Mortgage updateMortgage(@RequestBody Mortgage mortgage) {
        return mortgageService.save(mortgage);
    }

    /**
     * Deletes a Mortgage from the database by its ID.
     *
     * @param mortgage_id the ID of the Mortgage to be deleted.
     * @return a message indicating the successful deletion.
     */
    @DeleteMapping("/{mortgage_id}")
    public String deleteMortgage(@PathVariable int mortgage_id) {
        return mortgageService.deleteById(mortgage_id);
    }
}
