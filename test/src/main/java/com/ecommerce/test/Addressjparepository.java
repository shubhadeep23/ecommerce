package com.ecommerce.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Addressjparepository extends JpaRepository<Address, Integer> {

}
