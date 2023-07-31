package com.tkn.Core.repository;

import com.tkn.Core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUserRepository extends JpaRepository<User, String> {

    UserDetails findByLogin(String login);

}
