package com.tkn.Core.repository;

import com.tkn.Core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, String> {

    Optional<User> findByLogin(String login);

}
