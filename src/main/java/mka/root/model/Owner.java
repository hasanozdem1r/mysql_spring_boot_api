package mka.root.model;
import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;


@Entity
@Table(name = "owners")
public class Owner {
    @PositiveOrZero
    @NotNull
    @Id
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
