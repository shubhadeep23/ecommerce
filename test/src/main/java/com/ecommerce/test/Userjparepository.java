package com.ecommerce.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Userjparepository extends JpaRepository<User, Integer> {

}
