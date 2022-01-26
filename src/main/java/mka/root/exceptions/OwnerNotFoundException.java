package mka.root.exceptions;

public class OwnerNotFoundException extends Exception {

    private Integer emp_id;
    public OwnerNotFoundException(Integer owner_id) {
        super(String.format("Employee is not found with id : '%s'", owner_id));
    }
}