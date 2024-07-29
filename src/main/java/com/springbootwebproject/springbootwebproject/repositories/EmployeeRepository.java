package com.springbootwebproject.springbootwebproject.repositories;

import com.springbootwebproject.springbootwebproject.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {

}
