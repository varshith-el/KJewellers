package com.kjewellers.kjewellers.repository;

import com.kjewellers.kjewellers.model.User;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query("SELECT * FROM users WHERE username = :username")
    User findByUsername(@Param("username") String username);

    @Query("SELECT * FROM users WHERE email = :email")
    User findByEmail(@Param("email") String email);
}
