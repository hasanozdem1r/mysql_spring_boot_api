package mka.root.controller;
import mka.root.model.Owner;
import mka.root.repository.OwnerRepository;
import mka.root.exceptions.OwnerNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OwnerController {

    @Autowired
    OwnerRepository ownerRepository;

    // OWNER MODEL CRUD OPERATIONS

    // GET : read all owners
    // EXAMPLE : GET localhost:8080//mka/v1/owners
    @GetMapping("/mka/v1/owners")
    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    // GET : read a single owner
    // EXAMPLE : GET localhost:8080//mka/v1/owner/1
    @GetMapping("/mka/v1/owners/{id}")
    public Owner getDepartment(@PathVariable(value = "id") Integer owner_id) throws OwnerNotFoundException {
        return ownerRepository.findById(owner_id)
                .orElseThrow(() -> new OwnerNotFoundException(owner_id));
    }

    // POST :  Create a new owner
    // EXAMPLE : POST localhost:8080//mka/v1/owners/ + json data
    @PostMapping(value = "/mka/v1/owners/",consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Owner createDepartment(@Valid @RequestBody Owner owner) {
        return ownerRepository.save(owner);
    }

    // PUT : Update an owner details
    // EXAMPLE : PUT localhost:8080//mka/v1/owner/1
    @PutMapping(value="/mka/v1/owner/{id}",consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Owner updateDepartment(@PathVariable(value = "id") Integer owner_id,
                                       @Valid @RequestBody Owner ownerDetails) throws OwnerNotFoundException {

        Owner owner = ownerRepository.findById(owner_id)
                .orElseThrow(() -> new OwnerNotFoundException(owner_id));

        owner.setOwner_full_name(ownerDetails.getOwner_full_name());
        owner.setOwner_email(ownerDetails.getOwner_email());
        owner.setOwner_registration_date(ownerDetails.getOwner_registration_date());

        return ownerRepository.save(owner);
    }

    // DELETE : delete an owner
    // EXAMPLE : DELETE localhost:8080//mka/v1/owner/1
    @DeleteMapping("/mka/v1/owner/{id}")
    public Map<String, Boolean> deleteDepartment(@PathVariable(value = "id") Integer owner_id) throws OwnerNotFoundException {
        Owner owner = ownerRepository.findById(owner_id)
                .orElseThrow(() -> new OwnerNotFoundException(owner_id));

        ownerRepository.delete(owner);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Owner has been deleted", Boolean.TRUE);
        return response;
    }
}
