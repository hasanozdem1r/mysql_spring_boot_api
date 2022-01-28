package mka.root.model;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;
import java.util.Objects;
/*
Created by @hasanozdem1r 01/27/2022
 */


@Entity
@Table(name = "owners")
public class Owner {
    @NotNull
    @Id // JPA annotation to indicate the primary key and automatically populated by the JPA provider.
    private Integer owner_id;
    @NotBlank
    private String owner_full_name;
    @Email
    @NotBlank
    private String  owner_email;
    @NotNull
    private Date owner_registration_date;

    public Owner(){
        super();
    }
    public Owner(Integer owner_id, String owner_full_name, String owner_email, Date owner_registration_date){
        this.owner_id=owner_id;
        this.owner_full_name=owner_full_name;
        this.owner_email=owner_email;
        this.owner_registration_date=owner_registration_date;
    }

    // equals and hashCode methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return owner_id.equals(owner.owner_id) && owner_full_name.equals(owner.owner_full_name) && owner_email.equals(owner.owner_email) && owner_registration_date.equals(owner.owner_registration_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner_id, owner_full_name, owner_email, owner_registration_date);
    }


    // Getter & Setter for Owner Model Class

    public Integer getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(Integer owner_id) {
        this.owner_id = owner_id;
    }

    public String getOwner_full_name() {
        return owner_full_name;
    }

    public void setOwner_full_name(String owner_full_name) {
        this.owner_full_name = owner_full_name;
    }

    public String getOwner_email() {
        return owner_email;
    }

    public void setOwner_email(String owner_email) {
        this.owner_email = owner_email;
    }

    public Date getOwner_registration_date() {
        return owner_registration_date;
    }

    public void setOwner_registration_date(Date owner_registration_date) {
        this.owner_registration_date = owner_registration_date;
    }
}
