package ecommerce.com.classicman.repository;

import ecommerce.com.classicman.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatagoryRepository extends JpaRepository<Category, Integer> {
}
