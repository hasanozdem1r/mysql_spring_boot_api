package mka.root.model;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;


@Entity
@Table(name = "owners")
public class Product {
    @PositiveOrZero
    @NotNull
    @Id
    private Integer product_id;
    @NotBlank
    private String product_title;
    @NotBlank
    private String  product_description;
    private String product_link;
    @NotBlank
    private String product_geolocation;

    public Product(){
        super();
    }
    public Product(Integer product_id, String product_title, String product_description, String product_link, String product_geolocation){
        this.product_id=product_id;
        this.product_title=product_title;
        this.product_description=product_description;
        this.product_link=product_link;
        this.product_geolocation=product_geolocation;
    }

    // Getter & Setter for Owner Product Class

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getProduct_link() {
        return product_link;
    }

    public void setProduct_link(String product_link) {
        this.product_link = product_link;
    }

    public String getProduct_geolocation() {
        return product_geolocation;
    }

    public void setProduct_geolocation(String product_geolocation) {
        this.product_geolocation = product_geolocation;
    }
}
