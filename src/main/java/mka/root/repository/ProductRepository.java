package mka.root.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import mka.root.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
