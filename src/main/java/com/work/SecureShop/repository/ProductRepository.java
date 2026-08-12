package com.work.SecureShop.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.work.SecureShop.entity.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

    Page<Products> findByCategoryIgnoreCase(String category, Pageable pageable);

    Page<Products> findByNameContainingIgnoreCase(String keyword, Pageable pageable);
}