package com.June_15.June_SQL_CRUD.repository;

import com.June_15.June_SQL_CRUD.model.userModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepository extends JpaRepository <userModel,Integer> {
}
