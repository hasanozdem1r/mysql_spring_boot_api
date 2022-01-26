package mka.root.exceptions;

public class ProductNotFoundException extends Exception {

    private Integer emp_id;
    public ProductNotFoundException(Integer product_id) {
        super(String.format("Employee is not found with id : '%s'", product_id));
    }
}