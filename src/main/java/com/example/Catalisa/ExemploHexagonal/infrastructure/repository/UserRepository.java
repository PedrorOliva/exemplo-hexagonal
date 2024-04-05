package com.example.Catalisa.ExemploHexagonal.infrastructure.repository;

import com.example.Catalisa.ExemploHexagonal.domain.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
