package com.example.security.Repositories;

import com.example.security.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepository extends JpaRepository<UserModel, Long> {

    UserDetails findByLogin(String role);
}
