package com.database.web_shop.repositories;

import com.database.web_shop.models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ProductsRepo")
public interface ProductsRepo extends JpaRepository<Products, Integer> {

    @Query(value = "{call get_product_list(:amount, :page_no)}", nativeQuery = true)
    public List<Products> getProductList(@Param("amount") int amount, @Param("page_no") int page_no);
}
