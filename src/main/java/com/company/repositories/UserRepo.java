package com.company.repositories;

import com.company.models._User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<_User,Long> {

    Optional<_User> findByUsername(String username);

    Optional<_User> findByEmail(String email);
}
