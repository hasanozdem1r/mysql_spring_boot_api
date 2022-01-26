package mka.root.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mka.root.model.Owner;

@Repository
public interface OwnerRepository  extends JpaRepository<Owner, Integer> {

}
